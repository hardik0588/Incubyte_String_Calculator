import java.util.StringTokenizer;

public class StringCalculator {
    public  int add(String numbers)
    {
        if(numbers.equals(""))
        {
            return 0;
        }
        StringTokenizer st=new StringTokenizer(numbers,",");
        if(st.countTokens()==1)
        {
            return Integer.parseInt(numbers);
        }
        return -1;
    }  
}