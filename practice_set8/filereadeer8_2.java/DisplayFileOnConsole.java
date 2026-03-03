import java.io.*;
import java.util.Scanner;

public class DisplayFileOnConsole{
public static void main(String[] args){


    File file = new File("Students.txt");
    try{
        if(file.exists()){
            System.out.println("File Already Exists");
        }
        else{
            file.createNewFile();
            System.out.println("File Created Successfully");
        }
    }
    catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    FileWriter fw = null;
        BufferedReader br = null;
        try{
            fw = new FileWriter(file);

              // Write student records
            fw.write("101 Nihar 85\n");
            fw.write("102 Rahul 78\n");
            fw.write("103 Priya 92\n");
            fw.close();

        }
        catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally{
            try{
                if(fw != null){
                    fw.close();
                }
            }
            catch(IOException e){
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }

        try{
            br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Student Records:");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        finally{
            try{
                if(br != null){
                    br.close();
                }
            }
            catch(IOException e){
                System.out.println("An error occurred while closing the reader: " + e.getMessage());
            }
        }
}
}
