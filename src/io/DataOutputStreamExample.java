package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("example.txt"))) {
            dos.writeInt(42);
            dos.writeDouble(3.14);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}