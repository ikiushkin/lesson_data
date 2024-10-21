package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("example.txt"))) {
            int number = dis.readInt();
            double value = dis.readDouble();
            System.out.println("Number: " + number);
            System.out.println("Value: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
