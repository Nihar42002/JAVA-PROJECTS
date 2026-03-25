import java.io.*;

import java.util.Date;


public class fileoperations {
   
    public static void displayProperties(File file) {

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        System.out.println("\nFile Properties:");
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last Modified: " +
                new Date(file.lastModified()));
    }
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("provide command and file name as argumnets");
            return;
        }
        String command = args[0];
      
        try{
            if(command.equalsIgnoreCase("copy")){

                if(args.length < 3){
                    System.out.println("provide source and destination file names as arguments");
                    return;
                }
                String sourceFileName = args[1];
                String destFileName = args[2];

                File sourceFile = new File(sourceFileName);
                File destFile = new File(destFileName);
                FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile);
                if(!sourceFile.exists()){
                    System.out.println("Source file does not exist.");
                    return;
                }

                int ch;
                while((ch = fis.read()) != -1){
                    fos.write(ch);
                }

                fis.close();
                fos.close();
            

               System.out.println("File copied successfully.");
            displayProperties(destFile);
            }
        }
        catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
        if(command.equalsIgnoreCase("delete")){
        
            if(args.length < 2){
        
                System.out.println("provide file name as argument");
                return;
             }
        
            String fileName = args[1];
            File file = new File(fileName);
        
            if(file.delete()){
                System.out.print("File deleted successfully.");
            }
            else{
                System.out.println("Unable to delete file.");
            }
        
            if(command.equalsIgnoreCase("Rename")){
                       
                if(args.length < 3){
                    System.out.println("provide old and new file names as arguments");
                    return;
                }
                String oldFileName = args[1];
                String newFileName = args[2];

                File oldFile = new File(oldFileName);
                File newFile = new File(newFileName);

                if(!oldFile.exists()){
                    System.out.println("Old file does not exist.");
                    return;
                }

                if(oldFile.renameTo(newFile)){
                    System.out.println("File renamed successfully.");
                    displayProperties(newFile);
                }
                else{
                    System.out.println("Unable to rename file.");
                }
            }
        }            
    }

}

