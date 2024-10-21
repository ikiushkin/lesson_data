package io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            String data = "Hello, ByteArrayOutputStream!";
            baos.write(data.getBytes());
            System.out.println(baos);  // Преобразуем байты в строку
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
