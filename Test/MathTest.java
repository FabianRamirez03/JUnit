import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Las pruebas unitarias son sumamente útiles a la programar
ya que de esta manera se evitan malas practicas probar procesos
en consola a base de prints.
    Además, otra gran utilidad de esta clase de pruebas es a la hora
programar en conjunto, ya que de esta manera cada miembro del equipo
testifica que su trabajo funciona correctamente. En caso de que alguna
de las pruebas sea reprobada, significa que algún código nuevo lo provocó.
De esta manera se puede reconocer la falla facilmente y darle una solución
inmediata.


 */
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


    @Test
    void divisionTest(){

        assertThrows(IllegalArgumentException.class, () -> Math.division(4, 0));
    }


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
