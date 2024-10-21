package io.read_write;

import java.nio.file.*;
import java.io.IOException;

public class DirectoryDeleteExample {
    public static void main(String[] args) {
        Path path = Paths.get("newDirectory");
        try {
            Files.delete(path);
            System.out.println("Directory deleted.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
