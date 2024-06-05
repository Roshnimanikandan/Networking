import java.util.*;
import java.net.*;
import java.io.*;
public class Subnetting
{
    static String appendzeros(String str)
    {
        String temp="00000000";
        return temp.substring(str.length()) + str;
    }
    public static void main(String args[])
    {
        System.out.println("Enter the IP Address");
        Scanner sc= new Scanner(System.in);
        String ip=sc.nextLine();
        String ip_split[] = ip.split("\\.");

        String bip="";
        for(int i=0;i<ip_split.length;i++)
        {
            bip = bip+ appendzeros(Integer.toBinaryString(Integer.parseInt(ip_split[i])));
        }
        System.out.println("Binary format: "+bip);
        System.out.print("Enter the number of subnets in each address: ");
        int n;
       n= sc.nextInt();
       
        int bits = (int) Math.ceil(Math.log(n)/Math.log(2));
        int mask = 32-bits;
        System.out.println("Subnet mask: "+mask);

        System.out.println("Network address: "+ip);

        System.out.print("Broadcast address: ");

        Random random = new Random();
        ip_split[3] = Integer.toString(random.nextInt(100));
        for(int i=0;i<ip_split.length;i++)
        {
            System.out.print(ip_split[i]);
            if(i!=ip_split.length-1)
            System.out.print(".");
        }
    }
}