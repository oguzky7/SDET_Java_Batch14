package Repl212;

import java.io.*;
class Main {
    private static final String filename = "";
    public static void main(String[] args) {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader(new File(filename)));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
