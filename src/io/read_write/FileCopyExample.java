package io.read_write;

import java.nio.file.*;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        Path source = Paths.get("example.txt");
        Path target = Paths.get("copy.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
