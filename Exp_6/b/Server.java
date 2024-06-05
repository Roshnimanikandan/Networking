import java.util.*;
import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(10);
		Socket s = ss.accept();
		
	

		System.out.println("Connection established");
		

		BufferedReader socketReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String cmd = socketReader.readLine();
		
		ProcessBuilder pb = new ProcessBuilder(cmd.split(" "));
		Process p = pb.start();
		
		BufferedReader outputReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while((line=outputReader.readLine())!=null)
		{
		    System.out.println(line);
		}
		
		
	
	}
}
