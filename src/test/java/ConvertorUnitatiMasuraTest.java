import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ConvertorUnitatiMasuraTest {

    private static ConvertorUnitatiMasura convertorUnitatiMasura;

    @BeforeAll
    public static void beforeAll(){
        convertorUnitatiMasura = new ConvertorUnitatiMasura();
        System.out.println("BeforeAll");
    }
    @Disabled("Ignoring this test")
    @Test
    public void testFahrenheitToCelsius(){
        double result = convertorUnitatiMasura.fahrenheitToCelsius(35);
        Assertions.assertEquals(1.67,result,"Valorile nu sunt egale");
    }

}
