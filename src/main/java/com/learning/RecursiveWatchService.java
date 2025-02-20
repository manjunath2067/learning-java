package com.learning;

import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class RecursiveWatchService {
    private final WatchService watchService;
    private final Map<WatchKey, Path> keys;
    private final DateTimeFormatter dateTimeFormatter;

    public RecursiveWatchService(Path startDir) throws IOException {
        this.watchService = FileSystems.getDefault().newWatchService();
        this.keys = new HashMap<>();
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Register initial directory and all subdirectories
        registerAll(startDir);
    }

    private void registerAll(final Path startDir) throws IOException {
        // Register directory and subdirectories
        Files.walkFileTree(startDir, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(
                  Path dir,
                  BasicFileAttributes attrs
            ) throws IOException
            {
                register(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private void register(Path dir) throws IOException {
        WatchKey key = dir.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        keys.put(key, dir);
    }

    public void processEvents() {
        while (true) {
            WatchKey key;
            try {
                key = watchService.take();
            } catch (InterruptedException e) {
                return;
            }

            Path dir = keys.get(key);
            if (dir == null) {
                continue;
            }

            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();

                // Context for directory entry event is the file name of entry
                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path name = ev.context();
                Path child = dir.resolve(name);

                // Ignore temporary or backup files (e.g., files ending with ~)
                if (child.toString().endsWith("~")) {
                    continue;
                }

                // Check if the event is for an item directly in the monitored directory
                if (child.getParent().equals(dir)) {
                    String timeStamp = LocalDateTime.now().format(dateTimeFormatter);
                    System.out.println(timeStamp + " - " + kind.name() + ": " + child);
                }

                // If a directory is created, register it and its subdirectories
                if (kind == ENTRY_CREATE) {
                    try {
                        if (Files.isDirectory(child)) {
                            registerAll(child);
                        }
                    } catch (IOException e) {
                        // Handle error
                    }
                }
            }

            // Reset the key and remove from set if directory is no longer accessible
            boolean valid = key.reset();
            if (!valid) {
                keys.remove(key);
                if (keys.isEmpty()) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Path startDir = Paths.get("C:\\Users\\ixm2kor\\IdeaProjects\\Sample Projects\\src\\main\\java\\com\\learning");
        try {
            RecursiveWatchService recursiveWatchService = new RecursiveWatchService(startDir);
            System.out.println("Monitoring directory and subdirectories for changes...");
            recursiveWatchService.processEvents();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
