package io.read_write;

import java.nio.file.*;
import java.io.IOException;

public class DirectoryCreateExample {
    public static void main(String[] args) {
        Path path = Paths.get("newDirectory");
        try {
            Files.createDirectory(path);
            System.out.println("Directory created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
