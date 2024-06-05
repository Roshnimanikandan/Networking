import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class DateClient
{
    public static void main(String args[])throws Exception
    {
        InetAddress ia=InetAddress.getLocalHost();//For IP Address
        Socket s=new Socket(ia,20);

        
        BufferedReader socketReader=new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(socketReader.readLine());

        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        pw.println(ia);
    }
}






































// import java.net.*;
// import java.io.*;

// public class DateClient {
//     public static void main(String[] args) throws Exception {

   
//         InetAddress ia = InetAddress.getLocalHost();
//         Socket s = new Socket(ia, 8020);

//         BufferedReader socketReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
//         String sdate = socketReader.readLine();
//         System.out.println("THE date in the server is: " + sdate);

//         PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//         pw.println(ia);
//     }
// }
