import java.io.*;
import java.net.*;
public class server
{
    public static void main (String args[]) throws Exception
    {

        ServerSocket ss=new ServerSocket(18);

        Socket s=ss.accept();

        DataInputStream dis=new DataInputStream(s.getInputStream());

        int len=dis.readInt();

        System.out.println("Size : "+len/1024+ " KB");
    }

}