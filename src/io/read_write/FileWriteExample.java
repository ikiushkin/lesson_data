package io.read_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileWriteExample {
    public static void main(String[] args) {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
//            bw.write("Hello, World!");
//            bw.newLine();
//            bw.write("This is another line.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Path path = Paths.get("output.txt");
        try {
            Files.write(path, Arrays.asList("Hello, World!", "Another line"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
