package day11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerger {
    public static void main(String[] args) {
        String file1Path = "C:\\Users\\arpit\\Desktop\\JAVA\\day11\\input.txt";
        String file2Path = "C:\\Users\\arpit\\Desktop\\JAVA\\day11\\input1.txt";
        String file3Path = "C:\\Users\\arpit\\Desktop\\JAVA\\day11\\output.txt";

        try (
            //Create BuffferedReader for file1.txt and file2.txt
            BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));
            //Create BufferedWriter for file3.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(file3Path));
        ) {
            String line;

            //Read and write content from file1.txt to file3.txt
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }          
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }          
            System.out.println("Files merged successfully into " + file3Path);
        }  
        catch (IOException e) {
            
            System.err.println("An error ocurred during file merging: " + e.getMessage());
        }
    }
}
