import static org.junit.Assert.assertEquals;

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
}
