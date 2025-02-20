package org.example;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileCopyExample {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("C:\\Manjunath\\copytest");
        Path destinationPath = Paths.get("C:\\Manjunath\\destTest");

        //Path sourcePath = Paths.get("C:/logs");
//        String destinationPath = applicationConfig.getContainerMountPath()
//            + "/" + executionServiceHelper.getExecArtifactRootFolder()
//            + "/" + containerLogName + ".zip";

        //Path destinationFolderPath = Paths.get(destinationPath);

        try {
            // Copy all files from the source folder to the destination folder
            Files.walk(sourcePath)
                .forEach(source -> {
                    try {
                        Path destination = destinationPath.resolve(sourcePath.relativize(source));
                        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace(); // Handle the exception as needed
                    }
                });
            System.out.println("Files copied successfully! after archive failure");
        } catch (IOException e) {
            System.out.println("Error copying file In archive failed method");
        }
    }
}


