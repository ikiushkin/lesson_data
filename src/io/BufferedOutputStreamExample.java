package io;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("example.txt"))) {
            String data = "Hello, BufferedOutputStream!";
            bos.write(data.getBytes());
            bos.flush();  // Очищаем буфер перед закрытием потока
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}