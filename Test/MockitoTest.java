import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

/*

    Los MockObjects u objetos "falsos", son aquellos que
brindan una simulación de lo que debería retornar
una función o método, aunque el código de esta no
esté implementado en el proyecto aún.
    Es una herramienta sumamente poderosa ya que permite
continuar el desarrollo de una programa aunque falten elementos
fundamentales para su funcionamiento.
    Los mock objects son muy utilizados a la hora de programar
en conjunto a un equipo de trabajo ya que de esta forma, cada
programador puede cumplir con su parte, sin depender directamente
del trabajo de un compañero

 */




public class MockitoTest {


    @Test
    public void testGetAge(){
        //  create mock
        MockClass test = mock(MockClass.class);

        // define return value for method getName()
        when(test.getAge()).thenReturn(25);

        // use mock in test....
        assertEquals(test.getAge(), 25);

    }

    @Test
    public void testGetFullName(){
        MockClass test = mock(MockClass.class);

        when(test.getFullName()).thenReturn("Fabian Ramirez");

        assertEquals("Fabian Ramirez", test.getFullName());
    }

}
