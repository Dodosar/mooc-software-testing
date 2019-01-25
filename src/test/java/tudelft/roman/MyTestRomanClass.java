package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MyTestRomanClass {

    private RomanNumeral a;

    @BeforeEach
    public void initialize() {
        this.a = new RomanNumeral();
    }


    @Test
    public void resultI() {
        int result = a.convert("I");
        Assertions.assertEquals(1, result);
        System.out.println(result);
    }

    @Test
    public void resultX() {
        int result = a.convert("X");
        Assertions.assertEquals(10, result);
    }

    @Test
    public void resultXM() {
        int result = a.convert("XM");
        Assertions.assertEquals(990, result);
    }

    @Test
    public void resultXMM() {
        int result = a.convert("XMM");
        Assertions.assertEquals(1990, result);
    }

    @Test
    public void resultXXV() {
        int result = a.convert("XXV");
        Assertions.assertEquals(25, result);
    }

    @Test
    public void resultIX() {
        int result = a.convert("IX");
        Assertions.assertEquals(9, result);
    }

    @Test
    public void resultInvalidCalue() {
        int result = a.convert("XXC");
        Assertions.assertNotEquals(44, result);
    }

    @Test
    public void resultInvalidCalue2() {

        try {
            int result = a.convert("XXC");
        }
        catch(Exception a){
            Throwable exception = Assertions.assertThrows(Exception.class, () -> {
                throw new Exception("a message");
            });
            Assertions.assertEquals("a message", exception.getMessage());
        }


    }


    @Test
    void exceptionTesting() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("a message");
        });
        Assertions.assertEquals("a message", exception.getMessage());
    }
}