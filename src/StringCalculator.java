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
        if(st.countTokens()==1)
        {
            return Integer.parseInt(numbers);
        }
        else if(st.countTokens()==2)
        {
            int sum=0;
            while(st.hasMoreTokens())
            {
                sum =sum +Integer.parseInt(st.nextToken());
            }
            return sum;
        }
        else if(st.countTokens()==2 || st.countTokens()>1)
        {
            int sum=0;
            while(st.hasMoreTokens())
            {
                sum =sum +Integer.parseInt(st.nextToken());
            }
            return sum;
        }
        return -1;
    }
    
}