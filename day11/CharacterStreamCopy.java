package day11;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamCopy {
    public static void main(String[] args) {
        //Define input and output file names
        String inputFile = "C:\\Users\\arpit\\Desktop\\JAVA\\day11\\input.txt";
        String outputFile = "C:\\Users\\arpit\\Desktop\\JAVA\\day11\\output.txt";

        //Declare FileReader and FileWriter objects
        // FileReader reader = null;
        // FileWriter writer = null;

        try {
            //create FileReader to read from the input file
            FileReader reader = new FileReader(inputFile);

            //create FileWriter to write to the output file
            FileWriter writer = new FileWriter(outputFile);

            int character; //variable to store each character read

            //Read characters one by one until the end of the file (-1) is reached
            while ((character = reader.read()) != -1) {
                //Write the read character to the output file
                writer.write(character);
            }
            System.out.println("Character stream successfully copied from " + inputFile);
        }
        catch (IOException e) {
            //Handle potential IOException during file operations
            System.err.println("An error ourred: " + e.getMessage());
        }
        // finally {
        //     //Ensure streams are closed in a finally block to prevent resource leaks
        //     try {
        //         if (reader != null) {
        //             reader.close();
        //         }
        //         if (writer != null) {
        //             writer.close();
        //         }
        //     }
        //     catch (IOException e) {
        //         System.err.println("Error closing streams: " + e.getMessage());
        //     }
        // }
    }
}
