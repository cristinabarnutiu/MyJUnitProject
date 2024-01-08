import org.junit.jupiter.api.*;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void beforeAllMethod(){
        calculator = new Calculator();
        System.out.println("BeforeAll");
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

    @Test
    public void divideTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.divide(2,3);
        Assertions.assertEquals(result,0);
    }

    @Test
    public void moduloTest(){
        int result = calculator.modulo(9,2);
        Assertions.assertEquals(1,result);
    }



    @AfterEach
    public void afterEachMethod(){
        System.out.println("AfterEach");
    }

    @AfterAll
    public static void afterAllMethod(){
        System.out.println("AfterALl");
    }



}
