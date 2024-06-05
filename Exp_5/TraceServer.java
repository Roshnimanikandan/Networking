
import java.io.*;
import java.net.*;
public class TraceServer
{
    public static void main(String args[])  throws Exception
    {
       System.out.println("Enter your IP Address");

       BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

       String ip = consoleReader.readLine();

       ProcessBuilder builder = new ProcessBuilder("ping",ip);

       Process p = builder.start();

       BufferedReader processReader = new BufferedReader(new InputStreamReader(p.getInputStream()));

       String str;
       while ((str = processReader.readLine())!=null) {
        System.out.println(str);       
       }
    }
  
 }
