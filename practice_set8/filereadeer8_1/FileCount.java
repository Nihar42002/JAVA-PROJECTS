import java.io.File;
import java.util.Scanner;

public class FileCount {
    public static void main(String[] args){

 String FileName = args[0];
 int LineCount = 0;
 int WordCount = 0;
 int CharCount = 0;

 try{
File file = new File(FileName);
 Scanner scan = new Scanner(file);
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        LineCount++;
        String[] words = line.split(" ");
        WordCount += words.length;

        CharCount += line.length();
    }
    System.out.println("Lines: " + LineCount);
    System.out.println("Words: " + WordCount);
    System.out.println("Characters: " + CharCount);
scan.close();
 }catch(Exception e){
    System.out.println("An error occurred: " + e.getMessage());
 }

    }
}
