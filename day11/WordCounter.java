package day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\arpit\\Desktop\\JAVA\\day11\\output.txt";
        int wordCount = countWordsInFile(filePath);
        System.out.println("Total words in file: " + wordCount);
    }   
    public static int countWordsInFile(String filePath) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //Split the line into words using whitespace as a delimiter 
                //"\\s+" matches one or more whitespace characters
                String[] words = line.split("\\s+");
                //Add the number of words in the current line to the total count
                //Ensure to handle empty lines or lines with only whitespace
                for (String word : words) {
                    if (!word.trim().isEmpty()) { //only count non-empty words
                        count++;
                    }
                }
            }
        }
        catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return count;
    }
}
