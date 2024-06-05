public class BitStuffingDestuffing {
    
     static String bitStuffing(String data) {
        StringBuilder stuffedData = new StringBuilder();
        int consecutiveOnes = 0;

        for (int i = 0; i < data.length(); i++) 
        {
            char bit = data.charAt(i);
            stuffedData.append(bit);

            if (bit == '1') 
            {
                consecutiveOnes++;
                if (consecutiveOnes == 5) 
                {
                    stuffedData.append('0');
                    consecutiveOnes = 0;
                }
            } 
            else 
            {
                consecutiveOnes = 0;
            }
        }

        return stuffedData.toString();
    }
    
     static String bitDestuffing(String data) {
        StringBuilder destuffedData = new StringBuilder();
        int consecutiveOnes = 0;

        for (int i = 0; i < data.length(); i++) 
        {
            char bit = data.charAt(i);
            destuffedData.append(bit);

            if (bit == '1') 
            {
                consecutiveOnes++;
                if (consecutiveOnes == 5) 
                {
                    // Skip the next bit (it should be '0')
                    i++;
                    consecutiveOnes = 0;
                }
            } 
            else 
            {
                consecutiveOnes = 0;
            }
        }

        return destuffedData.toString();
    }

    public static void main(String[] args) {
        String data = "111111001111101111";
        System.out.println("Original Data: " + data);

        String stuffedData = bitStuffing(data);
        System.out.println("Stuffed Data: " + stuffedData);

        String destuffedData = bitDestuffing(stuffedData);
        System.out.println("Destuffed Data: " + destuffedData);
    }
}