import java.util.*;
import java.io.*;
import java.net.*;
import java.text.*;

public class DS{

    private static final Map<String,String> dns=new HashMap<>();

    static 
    {
        dns.put("google.com","17.89.56.31");
        dns.put("amazon.in","21.87.56.97");
    }

    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(18);

        System.out.println("Server is Running");

        while(true)
        {
            Socket s=ss.accept();

            BufferedReader socketReader=new BufferedReader(new InputStreamReader(s.getInputStream()));
            

            String host=socketReader.readLine();
            System.out.println("Request for "+host);

            PrintWriter sw=new PrintWriter(s.getOutputStream(),true);
            String ip=dns.getOrDefault(host,"Not Found");
            sw.println(ip);
        }
    }
}




































// import java.net.*;
// import java.util.*;
// import java.io.*;

// public class DS
// {
//     private static final Map<String,String> dnstable = new HashMap<>();

//     static
//     {
//         dnstable.put("google.com","234.12.123.14");
//         dnstable.put("flipkart.com","133.45.34.23");
//     }
//     public static void main(String args[]) throws Exception
//     {
//         ServerSocket serv = new ServerSocket(10);
        
//         System.out.println("Server is running");

//         while(true)
//         {   
//             Socket s = serv.accept();
//             BufferedReader socketReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
//             PrintWriter socketWriter = new PrintWriter(s.getOutputStream(),true);

//             String hostname = socketReader.readLine();
//             System.out.println("Request for "+hostname);

//             String ipAddress = dnstable.getOrDefault(hostname,"Hostname not found");
//             socketWriter.println(ipAddress);
//         }
//     }
// }