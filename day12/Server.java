//package day12;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);    //listen on port 5000
        System.out.println("Server is listening on port 5000");
        Socket clientSocket = serverSocket.accept();     //accept client connection
        System.out.println("Client connected: " + clientSocket.getInetAddress());

        //communication (e.g., read input from client, senf output)
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        String message = in.readLine();
        System.out.println("Client says: " + message);
        out.println("Hello from server!!!");
        clientSocket.close();
        serverSocket.close();
    }
}
