import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;

public class Filereader{
    public static void main(String[] args) {
        
        File file = new File("data.txt");
        try {
            if (file.exists()) {
                System.out.println("File Already Exists");
            } else {
                file.createNewFile();
                System.out.println("File Created Successfully");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        FileReader fr = null;
        BufferedReader br = null;
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split(" ");
                wordCount += words.length;
                charCount += line.length();
            }
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }


    }
}
