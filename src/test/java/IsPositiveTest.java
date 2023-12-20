import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class IsPositiveTest {

    @Test
    public void testCheckIsPositive(){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(6);
        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckIsNegative(){
        IsPositive isPositiveFalse = new IsPositive();
        IsPositive isPositiveFalse2 = new IsPositive();
        boolean result = isPositiveFalse.checkIsPositive(-6);
        boolean result2 = isPositiveFalse2.checkIsPositive(-19999);
        Assertions.assertFalse(result);
        Assertions.assertTrue(!result2);// not the preferred method
    }









}
