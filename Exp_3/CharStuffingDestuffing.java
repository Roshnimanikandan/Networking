public class CharStuffingDestuffing {
    
    static String charStuffing(String data) {
       StringBuilder stuffedData = new StringBuilder();
       int consecutive_A = 0;

       for (int i = 0; i < data.length(); i++) 
       {
           char bit = data.charAt(i);
           stuffedData.append(bit);

           if (bit == 'A') 
           {
               consecutive_A++;
               if (consecutive_A == 5) 
               {
                   stuffedData.append('Z');
                   consecutive_A = 0;
               }
           } 
           else 
           {
               consecutive_A = 0;
           }
       }

       return stuffedData.toString();
   }
   
    static String charDestuffing(String data) {
       StringBuilder destuffedData = new StringBuilder();
       int consecutive_A = 0;

       for (int i = 0; i < data.length(); i++) 
       {
           char bit = data.charAt(i);
           destuffedData.append(bit);

           if (bit == 'A') 
           {
               consecutive_A++;
               if (consecutive_A == 5) 
               {
                   // Skip the next bit (it should be '0')
                   i++;
                   consecutive_A = 0;
               }
           } 
           else 
           {
               consecutive_A = 0;
           }
       }

       return destuffedData.toString();
   }

   public static void main(String[] args) {
       String data = "AAAAABCDEFGAAAAAVJAA";
       System.out.println("Original Data: " + data);

       String stuffedData = charStuffing(data);
       System.out.println("Stuffed Data: " + stuffedData);

       String destuffedData = charDestuffing(stuffedData);
       System.out.println("Destuffed Data: " + destuffedData);
   }
}