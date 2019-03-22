import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathTest {

    @Test
    void additionTest(){
        int a = Math.addition(5,8);
        assertEquals(13, a);
    }

    @Test
    void stringAdditionTest(){
        String a = Math.stringAddition("5","8");
        assertEquals("13", a);
    }

    /**
    @Test
    void divisionTest(){
        double a = Math.division(4,8);

        assertEquals("divisor cannot be zero", b);

        assertEquals(0.5, a);
    }
    */

    @Test
    void getRandomNumberTest(){
        int i = Math.getRandomNumberInRange(1, 9);
        Assertions.assertTrue(i>=1);
        Assertions.assertTrue(i<=9);
    }

    @Test
    void clampTest(){
        int i = Math.clamp(1,2,3);
        assertEquals(2, i);
        i = Math.clamp(4,2,3);
        assertEquals(3, i);
        i = Math.clamp(4,2,5);
        assertEquals(4, i);
    }
}
