
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveTest {

    @Test
    public void testCheckIsPositive(){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(6);
        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckIsNegative(){

    }
}
