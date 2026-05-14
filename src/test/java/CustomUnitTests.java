import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomUnitTests {
    ValidadorPassword vp = new ValidadorPassword();


    @Test
    public void checkShortLimit(){
        Assertions.assertFalse(vp.esValida("abc1234"));
        Assertions.assertTrue(vp.esValida("abc12345"));
        Assertions.assertTrue(vp.esValida("abc123456"));
    }


    @Test
    public void checkLongLimit(){
        Assertions.assertFalse(vp.esValida("abcdef1234567"));
        Assertions.assertTrue(vp.esValida("abcdef123456"));
        Assertions.assertTrue(vp.esValida("abcdef12345"));
    }


    @Test
    public void checkBlanks(){
        Assertions.assertFalse(vp.esValida(" abcd12345"));
        Assertions.assertFalse(vp.esValida("abcd 12345"));
        Assertions.assertFalse(vp.esValida("abcd12345 "));
    }


    @Test
    public void checkNoNumbers(){
        Assertions.assertFalse(vp.esValida("abcdefghi"));
    }


    @Test
    public void checkNull(){
        Assertions.assertFalse(vp.esValida(null));
    }


    @Test
    public void checkCorrect(){
        Assertions.assertTrue(vp.esValida("abcdefgh1"));
        Assertions.assertTrue(vp.esValida("1234567890"));
        Assertions.assertTrue(vp.esValida("abcd1234567"));
    }
}
