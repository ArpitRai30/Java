package day11;
import java.io.*;

public class CopyObject {
    //method to write a Person object to a file
    public static void writePersonToFile(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Person object written to " + filename);
        }
        catch (IOException e) {
            System.out.println("Error writing person to file: " + e.getMessage());
        }
    }

    //method to read a Person object from a file
    public static Person readPersonFromFile(String filename) {
        Person person = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            person = (Person) ois.readObject();
            System.out.println("Person object read from  " + filename);
        }
        catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading person from file: " + e.getMessage());
        }
        return person;
    }

    public static void main(String[] args) {
        //create a person object 
        Person originalPerson = new Person("Alice", 30);

        //Define the filename
        String filename = "person.ser";

        //write the object to the file
        writePersonToFile(originalPerson, filename);

        //read the object from the file
        Person retrievedPerson = readPersonFromFile(filename);

        //verify the retrieved object 
        if (retrievedPerson != null) {
            System.out.println("Retrieved Person: " + retrievedPerson);
        }
    }
}
