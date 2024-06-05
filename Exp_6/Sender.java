import java.util.*;
import java.io.*;
import java.net.*;

public class Sender
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(2004);
		System.out.println("Waiting for Client");
		
	
		    Socket s = ss.accept();
		    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    PrintWriter writer = new PrintWriter(s.getOutputStream(),true);
			BufferedReader client = new BufferedReader(new InputStreamReader(s.getInputStream()));
		    
		    System.out.println("Server");
			System.out.println("Connected to " + client.readLine());
		    int no = Integer.parseInt(reader.readLine());
		    
		    int sq = no * no;
		    
		    writer.println(sq);
		    writer.println(no);
		    System.out.println("The Output of Square of the No : "+sq);
		
		
		
	}
}
