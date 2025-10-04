import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient2 {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();
        InetAddress serverAddr = InetAddress.getByName("127.0.0.1");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter message: ");
            String msg = sc.nextLine();
            if (msg.equalsIgnoreCase("exit")) break;
            byte[] data = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, serverAddr, 12345);
            socket.send(packet);
            byte[] buffer = new byte[1024];
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            socket.receive(reply);
            System.out.println("Server: " + new String(reply.getData()));
        }
    }
}
