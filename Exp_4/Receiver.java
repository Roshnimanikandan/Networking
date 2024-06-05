import java.io.*;
import java.net.*;

public class Receiver
{
    public static void main(String args[]) throws Exception
    {
        Socket s = new Socket("localhost",10);

        BufferedReader socketReader = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String message;
        int frames;

        frames = Integer.parseInt(socketReader.readLine());

        System.out.println("Frames Sent = "+frames);

        for(int i=0;i<frames;i++)
        {
            message = socketReader.readLine();
            System.out.println(message);
        }
    }
}