import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
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
