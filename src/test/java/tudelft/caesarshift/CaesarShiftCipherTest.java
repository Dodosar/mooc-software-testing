package tudelft.caesarshift;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher test;

    @BeforeEach
    public void initialize(){
        this.test = new CaesarShiftCipher();
    }

    @Test
    public void TestAbcAnd3Shift(){
        String result =test.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def",result);
    }

    @Test
    public void TestLast3CharsAnd3Shift(){
        String result =test.CaesarShiftCipher("xyz",3);
        Assertions.assertEquals("abc",result);
    }

    @Test
    public void TestLast2AndFirst1CharsAnd3Shift(){
        String result =test.CaesarShiftCipher("yza",3);
        Assertions.assertEquals("bcd",result);
    }

    @Test
    public void TestLast3AndShift0(){
        String result =test.CaesarShiftCipher("xyz",0);
        Assertions.assertEquals("xyz",result);
    }

    @Test
    public void TestLast3AndShiftMinus1(){
        String result =test.CaesarShiftCipher("xyz",-1);
        Assertions.assertEquals("wxy",result);
    }

    @Test
    public void TestAbcAnd3Shift26(){
        String result =test.CaesarShiftCipher("abc",26);
        Assertions.assertEquals("abc",result);
    }


    @Test
    public void TestAAnd3Shift26(){
        String result =test.CaesarShiftCipher("a",26);
        Assertions.assertEquals("a",result);
    }

    @Test
    public void TestEmptyAnd3Shift26(){
        String result =test.CaesarShiftCipher("",26);
        Assertions.assertEquals("",result);
    }

    @Test
    public void TestNumbersTextAnd3Shift26(){
        String result =test.CaesarShiftCipher("123",3);
        Assertions.assertNotEquals("456",result);
    }


    @Test
    public void TestLast1CharsAnd3Shift(){
        String result =test.CaesarShiftCipher("x",2);
        Assertions.assertEquals("z",result);
    }


    @Test
    public void TestLast1And1FirstCharsAnd3Shift(){
        String result =test.CaesarShiftCipher("xa",2);
        Assertions.assertEquals("zc",result);
    }


}
