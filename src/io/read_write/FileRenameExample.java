package io.read_write;

import java.nio.file.*;
import java.io.IOException;

public class FileRenameExample {
    public static void main(String[] args) {
        Path source = Paths.get("example.txt");
        Path target = Paths.get("newFile.txt");
        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File renamed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
