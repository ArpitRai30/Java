import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws IOException {
        int port = 12345; // Port number for communication
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server started. Waiting for client on port " + port);

        Socket clientSocket = serverSocket.accept(); // Accept client connection
        System.out.println("Client connected: " + clientSocket.getInetAddress());

        File fileToSend = new File("server_file.txt"); // File to send
        if (!fileToSend.exists()) {
            System.err.println("Error: server_file.txt not found.");
            clientSocket.close();
            serverSocket.close();
            return;
        }

        FileInputStream fis = new FileInputStream(fileToSend);
        BufferedInputStream bis = new BufferedInputStream(fis);
        OutputStream os = clientSocket.getOutputStream();

        byte[] buffer = new byte[8192]; // Buffer for transferring data
        int bytesRead;

        System.out.println("Sending file: " + fileToSend.getName());
        while ((bytesRead = bis.read(buffer)) != -1) {
            os.write(buffer, 0, bytesRead);
        }

        System.out.println("File sent successfully.");

        bis.close();
        fis.close();
        os.close();
        clientSocket.close();
        serverSocket.close();
    }
}