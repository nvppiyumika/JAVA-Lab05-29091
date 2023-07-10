package com.mycompany.practical7q3;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Practical7Q3 {

    public static void main(String[] args) {
        String filePath = "C:/Users/pasin/Desktop/abc.txt";

        try {
            File file = new File(filePath);

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: File not found. Please check the file path and try again.");
        }
    }
}
