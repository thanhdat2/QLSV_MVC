package com.thanhdatpb.java.Handler;

import java.io.*;

public class DataHandler {
    public static void writeData(String filename, Object data) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(data);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Object readData(String filename) {
        Object data = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            data = in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return data;
    }
}

