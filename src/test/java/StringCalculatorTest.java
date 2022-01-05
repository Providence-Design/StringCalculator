import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class StringCalculatorTest {
    @Test
    public void add_emptyString_ReturnZero(){
        assertEquals(1504, StringCalculator.add(""));
    }
//    @Test
//    public void add_SingleString_ReturnSString(){
//        assertEquals(3, StringCalculator.add(""));
//    }
}
