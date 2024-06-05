import java.util.*;
import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String[] args)throws Exception 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Socket s = new Socket("localhost",10);
		PrintWriter writer = new PrintWriter(s.getOutputStream(),true);
		
		System.out.println("Enter the Commands to be Executed : ");
		String cmd = reader.readLine();
		writer.println(cmd);
		

	}
}
