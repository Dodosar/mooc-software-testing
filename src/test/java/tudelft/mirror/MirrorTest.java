package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private Mirror mir;

    @BeforeEach
    public void initialization(){
        this.mir = new Mirror();
    }

    @Test
    public void Test3Chars(){
        String actual = mir.mirrorEnds("aba");

        Assertions.assertEquals("aa",actual);
    }

    @Test
    public void Test2CharsNoTheSame(){
        String actual = mir.mirrorEnds("ac");

        Assertions.assertEquals("ac",actual);
    }

    @Test
    public void Test2Chars(){
        String actual = mir.mirrorEnds("bb");

        Assertions.assertEquals("bb",actual);
    }

    @Test
    public void Test4CharsNotTheSame(){
        String actual = mir.mirrorEnds("aabb");

        Assertions.assertEquals("aabb",actual);
    }

    @Test
    public void Test4Chars(){
        String actual = mir.mirrorEnds("acca");

        Assertions.assertEquals("acca",actual);
    }

    /*@Test
    public void Test1Chars(){
        String actual = mir.mirrorEnds("a");

        Assertions.assertEquals("a",actual);
    }*/
    /* it is not a string, its a char*/
}
