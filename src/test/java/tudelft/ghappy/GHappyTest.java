package tudelft.ghappy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    public void initialize(){
        this.gHappy = new GHappy();
    }

    @Test
    public void twoG(){
        gHappy.gHappy("xxggxx");
    }

    @Test
    public void oneG(){
        gHappy.gHappy("xxgxx");
    }

    @Test
    public void separatedG(){
        gHappy.gHappy("xxggyygxx");
    }
}
