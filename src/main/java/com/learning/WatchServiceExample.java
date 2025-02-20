package com.learning;

import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;
import java.io.IOException;

public class WatchServiceExample {
    public static void main(String[] args) {
        try {
            // Create a WatchService
            WatchService watchService = FileSystems.getDefault().newWatchService();

            // Define the path to be monitored
            Path path = Paths.get("C:\\Users\\ixm2kor\\IdeaProjects\\Sample Projects\\src\\main\\java\\com\\learning");

            // Register the path with the watch service for specified events
            path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

            System.out.println("Monitoring directory for changes...");

            // Infinite loop to wait for events
            while (true) {
                WatchKey key;
                try {
                    // Wait for a watch key to be available
                    key = watchService.take();
                } catch (InterruptedException ex) {
                    return;
                }

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    // Ignore overflow events
                    if (kind == OVERFLOW) {
                        continue;
                    }

                    // Context for directory entry event is the file name of entry
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fileName = ev.context();

                    System.out.println(kind.name() + ": " + fileName);

                    // Add your custom logic here
                    // For example, if a new file is created, you might want to read its content
                    if (kind == ENTRY_CREATE) {
                        // Handle file creation event
                        System.out.println("A new file is created: " + fileName);
                    } else if (kind == ENTRY_DELETE) {
                        // Handle file deletion event
                        System.out.println("A file is deleted: " + fileName);
                    } else if (kind == ENTRY_MODIFY) {
                        // Handle file modification event
                        System.out.println("A file is modified: " + fileName);
                    }
                }

                // Reset the key and remove from set if directory is no longer accessible
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
