import java.util.*;
import java.io.*;
import java.net.*;

public class Client1
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("localhost",2004);
		PrintWriter writer = new PrintWriter(s.getOutputStream(),true);
		
		// int num = Integer.parseInt(reader.readLine());
		writer.println("Client 1 ");
	//	writer.println(num);
		
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		int sq = Integer.parseInt(reader1.readLine());
		int num=Integer.parseInt(reader1.readLine());
		System.out.println("The sq of the "+num+" is "+sq);
		
		s.close();
	}
}
