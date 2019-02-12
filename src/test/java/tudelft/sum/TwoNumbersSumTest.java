package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class TwoNumbersSumTest {

    private TwoNumbersSum sum;

    @BeforeEach
    public void initialize() {
        this.sum = new TwoNumbersSum();
    }

    @Test
    public void OneAndTwo(){
        ArrayList<Integer> anArray = new ArrayList<Integer>();
        anArray.add(1);
        anArray.add(2);
        ArrayList<Integer> anArray2 = new ArrayList<Integer>();
        anArray2.add(3);
        anArray2.add(4);
        ArrayList<Integer> result = sum.addTwoNumbers(anArray,anArray2);
        Assertions.assertEquals("[6, 4]",result.toString());
    }


    @Test
    public void ZeroAndOne(){
        ArrayList<Integer> anArray = new ArrayList<Integer>();
        anArray.add(0);
        ArrayList<Integer> anArray2 = new ArrayList<Integer>();
        anArray2.add(1);
        ArrayList<Integer> result = sum.addTwoNumbers(anArray,anArray2);
        Assertions.assertEquals("[1]",result.toString());
    }

    @Test
    public void EightAOnendNintyFour(){
        ArrayList<Integer> anArray = new ArrayList<Integer>();
        anArray.add(8);
        anArray.add(1);
        ArrayList<Integer> anArray2 = new ArrayList<Integer>();
        anArray2.add(9);
        anArray2.add(4);
        ArrayList<Integer> result = sum.addTwoNumbers(anArray,anArray2);
        Assertions.assertEquals("[5, 7]",result.toString());
    }


    @Test
    public void EightAOnendNintyFour2(){
        ArrayList<Integer> anArray = new ArrayList<Integer>();
        anArray.add(8);
        anArray.add(1);
        anArray.add(9);
        ArrayList<Integer> anArray2 = new ArrayList<Integer>();
        anArray2.add(9);
        anArray2.add(4);
        anArray2.add(7);
        ArrayList<Integer> result = sum.addTwoNumbers(anArray,anArray2);
        Assertions.assertEquals("[6, 6, 7]",result.toString());
    }

}
