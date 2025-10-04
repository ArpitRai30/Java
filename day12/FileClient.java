import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost"; // Server IP address or hostname
        int port = 12345; // Port number for communication

        Socket socket = new Socket(serverAddress, port);
        System.out.println("Connected to server: " + serverAddress + ":" + port);

        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("received_file.txt"); // File to save
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] buffer = new byte[8192];
        int bytesRead;

        System.out.println("Receiving file...");
        while ((bytesRead = is.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        System.out.println("File received and saved as received_file.txt");

        bos.close();
        fos.close();
        is.close();
        socket.close();
    }
}