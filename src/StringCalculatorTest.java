import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
    
    @Test
    public void hasReturnZeroIfStingIsEmpty() {
        StringCalculator stringCalculator = new StringCalculator();
        String inputValue = "";
        int expectedValue = 0;
        int actualValue = stringCalculator.add(inputValue);
        assertEquals(expectedValue, actualValue);
    }

}
