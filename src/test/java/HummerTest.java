import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HummerTest {


    private Hummer hummer;

    @Before
    public void before(){
        hummer = new Hummer("Armoured 4X4", 8);
    }

    @Test
    public void canGetType(){
        assertEquals("Armoured 4X4", hummer.getType());
    }

    @Test
    public void canGetVehicleHealth(){
        assertEquals(8, hummer.getHealthValue());
    }
}
