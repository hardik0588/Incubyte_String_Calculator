import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void initForTests() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void hasReturnZeroIfStingIsEmpty() {
        String inputValue = "";
        int expectedValue = 0;
        int actualValue = stringCalculator.add(inputValue);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void hasOneValues() {
        String inputValue = "1";
        int expectedValue = 1;
        int actualValue = stringCalculator.add(inputValue);
        assertEquals("it should return one if it has one arugment", expectedValue, actualValue);
    }
    @Test
    public void hasTwoValues(){
        String inputValue="1,2";
        int expectedValue=3;
        int actualValue=stringCalculator.add(inputValue);
        assertEquals("It should return two if it has two arugments",expectedValue, actualValue);
    }
    @Test
    public void hasNumberOfValues(){
        String inputValue="1,2,3,4,5";
        int expectedValue=15;
        int actualValue=stringCalculator.add(inputValue);
        assertEquals("It should return the sum of unknown amount of numbers",expectedValue, actualValue);
    }
    @Test
    public void hasAlpaValues()
    {
        String inputValue="h";
        int expectedValue=8;
        int actualValue=stringCalculator.add(inputValue);
        assertEquals("It should return the sum of alphabet values",expectedValue, actualValue);
    }
    @Test
    public void hasMultipalAlpaValue()
    {
        String inputValue="1,2,13,a,b,c,d";
        int expectedValue=26;
        int actualValue=stringCalculator.add(inputValue);
        assertEquals("It should return the sum of all alphabet values and numberic values",expectedValue,actualValue);
    }
    
    @Test
    public void hasNegitiveValue()
    {
        Exception e=assertThrows(Exception.class,()->stringCalculator.
        add("-5"));
        assertEquals("Negative not allowed -5,",e.getMessage());
    }
    @Test
    public void hasMorethanOneNegitiveValues()
    {
        Exception e=assertThrows(Exception.class,()->stringCalculator.
        add("-1,15,-5"));
        assertEquals("Negative not allowed -1,-5,",e.getMessage());
    }
    
    @Test
    public void hasMoreThanOneThousandValue()
    {
        String inputValue="2,1001";
        int expectedValue=2;
        int actualValue=stringCalculator.add(inputValue);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void hasAllowedNewLineValues()
    {
        String inputValue="1,1,2\n3";
        int expectedValue=7;
        int actualValue=stringCalculator.add(inputValue);
        assertEquals(expectedValue,actualValue);
    }
}
