import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("wireless", 2);
    }

    @Test
    public void hasType(){
        assertEquals("wireless", mouse.getType());
    }

    @Test
    public void hasNumberOfButtons(){
        assertEquals(2, mouse.getNumOfButtons());
    }

}
