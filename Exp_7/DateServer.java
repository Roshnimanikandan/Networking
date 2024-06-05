import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

public class DateServer
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(20);
        Socket s=ss.accept();

        PrintWriter sw=new PrintWriter(s.getOutputStream(),true);

        Date currentDate=new Date();
        sw.println(currentDate);

        BufferedReader socketReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String ip=socketReader.readLine();
        System.out.println("IP : "+ ip);
    }
}









































// import java.net.*;
// import java.io.*;
// import java.text.*;
// import java.util.*;

// public class DateServer {
//     public static void main(String[] args) throws Exception
//      {
//         ServerSocket ss = new ServerSocket(8020);
//         Socket s = ss.accept();

//         PrintWriter pw = new PrintWriter(s.getOutputStream(),true);

//         Date currentDate = new Date();
//         pw.println(currentDate);

//         BufferedReader dis = new BufferedReader(new InputStreamReader(s.getInputStream()));
//         String inet = dis.readLine();
//         System.out.println("THE CLIENT SYSTEM ADDRESS IS: " + inet);

//     }
// }