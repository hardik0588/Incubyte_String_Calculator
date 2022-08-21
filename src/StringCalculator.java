import java.util.StringTokenizer;

public class StringCalculator {
    public  int add(String numbers)
    {
        
        if(numbers.equals(""))
        {
            return 0;
        }
        
        if(!Character.isDigit(numbers.charAt(0)))
        {
            int charcter=numbers.charAt(0);
            return charcter-96;
        }
        
        StringTokenizer st=new StringTokenizer(numbers,",");
        int sum=0;
        while(st.hasMoreTokens())
        {
            String str=st.nextToken();
            char ch=str.charAt(0);
            if(!Character.isDigit(ch))
            {
                int num=ch;
                num=num-96;
                sum=sum+num;
            }
            else if(Integer.parseInt(str)<0)
            {
                throw new RuntimeException("Negative not allowed");
            }
            else 
            {
                sum=sum+Integer.parseInt(str);
            }
            
        }
        return sum;
    }
    
}