import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.image.*;
import javax.imageio.*;

public class client
{
    public static void main(String args[]) throws Exception
    {
      
        Socket s=new Socket("localhost",18);

        BufferedImage img=ImageIO.read(new File("C:\\Users\\Username\\Desktop\\Virat Kohli hd wallpaper ios16 for iphone wallpaper.jpeg"));

        ByteArrayOutputStream baos=new ByteArrayOutputStream();

        ImageIO.write(img, "jpeg", baos);

        baos.flush();

        DataOutputStream ds=new DataOutputStream(s.getOutputStream());
        ds.writeInt(baos.toByteArray().length);

        
    }
}