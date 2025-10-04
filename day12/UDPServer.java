import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket=new DatagramSocket(12345);
        System.out.println("UDP server Started...");

        while (true ) {
            byte[] buffer=new byte[1024];
            DatagramPacket packet=new DatagramPacket(buffer, buffer.length);

            //recieve message
            socket.receive(packet);

            //Handle client in a new thread
            new Thread(()->{
                try{
                    String msg=new String(packet.getData(),0,packet.getLength());
                    System.out.println("Client: "+msg);
                    String reply="Echo: "+msg;
                    byte[] data=reply.getBytes();
                    DatagramPacket replyPacket=
                    new DatagramPacket(data, data.length,packet.getAddress(),packet.getPort());
                    socket.send(replyPacket);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }).start();
        }
        
    }
}