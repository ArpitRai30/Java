//package day12;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000); //connect to server on port
        System.out.println("Connected to server...");

        //communication (e.g., send output to server, read input)
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("Hello from Client!");
        String response = in.readLine();
        System.out.println("Server says: " + response);

        socket.close();
    }
}
