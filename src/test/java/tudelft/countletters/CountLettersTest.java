package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWords1() {
        int words = new CountLetters().count("cats|dogs|pets");
        Assertions.assertEquals(3, words);
    }

    @Test
    public void multipleMatchingWords2() {
        int words = new CountLetters().count("cats|dogss");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void multipleMatchingWords3() {
        int words = new CountLetters().count("cats|dogr|testx");
        Assertions.assertEquals(3, words);
    }

    @Test
    public void multipleMatchingWords4() {
        int words = new CountLetters().count("cats|dogr|");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void multipleMatchingWords5() {
        int words = new CountLetters().count("cats|dog|");
        Assertions.assertEquals(1, words);
    }



}