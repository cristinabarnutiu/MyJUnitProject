import org.junit.jupiter.api.*;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void beforeAllMethod(){
        calculator = new Calculator();
        System.out.println("BeforeALl");
    }
    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("BeforeEach");
    }

    @Test
    public void addTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.add(2,3);
        Assertions.assertEquals(result,5);
    }

    @Test
    public void diffTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.diff(2,3);
        Assertions.assertEquals(result,-1);
    }

    @Test
    public void productTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.product(2,3);
        Assertions.assertEquals(result,6);
    }

    public void divideTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.divide(2,3);
        Assertions.assertEquals(result,0);
    }

    @AfterAll
    public static void afterAllMethod(){
        System.out.println("AfterALl");
    }

    @AfterEach
    public void afterEachMethod(){
        calculator = new Calculator();
        System.out.println("AfterEach");
    }

}
