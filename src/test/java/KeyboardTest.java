import device_management.Keyboard;
import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("wireless");
    }

    @Test
    public void hasType(){
        assertEquals("wireless", keyboard.getType());
    }

}
