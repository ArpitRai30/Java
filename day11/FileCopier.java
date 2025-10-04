package day11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path of the source file: ");
        String sourceFilePath = sc.nextLine();

        System.out.print("Enter the path of the destination file: ");
        String destinationFilePath = sc.nextLine();

        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        try (FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024]; //Buffer for reading bytes
            int bytesRead;

            //Read bytes from  the source file and write them to the destination file
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File copied successfully from " + sourceFilePath + " to " + destinationFilePath);
        }
        catch (IOException e) {
            System.err.println("An error occured during file copying: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
