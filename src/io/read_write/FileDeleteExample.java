package io.read_write;

import java.nio.file.*;
import java.io.IOException;

public class FileDeleteExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        try {
            Files.delete(path);
            System.out.println("File deleted.");
        } catch (NoSuchFileException e) {
            System.out.println("No such file exists.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}