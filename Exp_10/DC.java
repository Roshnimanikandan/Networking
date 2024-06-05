import java.util.*;
import java.io.*;
import java.net.*;
import java.text.*;

public class DC
{
    public static void main(String args[])throws Exception
    {
        Socket s=new Socket("localhost",18);

        System.out.println("Enter DNS: ");

        BufferedReader consoleReader=new BufferedReader(new InputStreamReader(System.in));

        PrintWriter sw=new PrintWriter(s.getOutputStream(),true);

        BufferedReader socketReader=new BufferedReader(new InputStreamReader(s.getInputStream()));

        String dns=consoleReader.readLine();
        sw.println(dns);

        String ip=socketReader.readLine();
        System.out.println(ip);
    }
}





































// import java.util.*;
// import java.io.*;
// import java.net.*;

// public class DC
// {
//     public static void main(String args[]) throws Exception
//     {
//         Socket s = new Socket("localhost",10);

//         System.out.println("Enter the hostname");

//         BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedReader socketReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
//         PrintWriter socketWriter = new PrintWriter(s.getOutputStream(),true);

//         String hostname = consoleReader.readLine();
//         socketWriter.println(hostname);

//         String ipAddress = socketReader.readLine();
//         System.out.println(ipAddress);
//     }
// }