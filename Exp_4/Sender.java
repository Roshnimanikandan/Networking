import java.io.*;
import java.net.*;
import java.util.*;
public class Sender
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket serv = new ServerSocket(10);
        Socket s = serv.accept();

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader socketReader = new BufferedReader(new InputStreamReader(s.getInputStream()));

        PrintWriter socketWriter = new PrintWriter(s.getOutputStream(),true);

        String[] sbuff = new String[8];

        int i,nf=0,sws=8,sptr=0;

        System.out.print("Enter the number of frames to send: ");

        nf = Integer.parseInt(consoleReader.readLine());

        socketWriter.println(nf);

        if(nf<=sws-1)
        {
            for( i=1;i<=nf;i++)
            {
                sbuff[sptr] = consoleReader.readLine();
                socketWriter.println(sbuff[sptr]);
                sptr = (sptr+1)%8;
            }
            System.out.println("Acknowledgement sent for "+nf + " frames");
        }
        else
        System.out.println("Frames exceeded");


        
    }
}