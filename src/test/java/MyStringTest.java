import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MyStringTest {
    private static MyString myString;

    @BeforeAll
    public static void beforeAll() {
        myString = new MyString();
        System.out.println("BeforeAll");
    }

    @Test
    public void testReturnNumberOfCharacters() {
        int result = myString.returnNumberOfCharacters("revelion");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testReturnConcatenatedSTrings() {
        String result = myString.returnConcatenatedStrings("LA ", "MULTI ", "ANI");
        Assertions.assertEquals("LA MULTI ANI", result);
    }


    @Test
    public void testfirstLetterIsVowel(){
        //boolean result1 = myString.firstLetterIsVowel("Cacofonie");
        //boolean result2 = myString.firstLetterIsVowel("America");
        Assertions.assertFalse(myString.firstLetterIsVowel("Cacofonie"));
        Assertions.assertTrue(myString.firstLetterIsVowel("America"));
    }
}