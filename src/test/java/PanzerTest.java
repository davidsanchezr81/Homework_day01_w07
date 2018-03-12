import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PanzerTest {

    private Panzer panzer;

    @Before
    public void before(){
        panzer = new Panzer("Tank", 10);
    }

    @Test
    public void canGetType(){
        assertEquals("Tank", panzer.getType());
    }

    @Test
    public void canGetVehicleHealth(){
        assertEquals(10, panzer.getHealthValue());
    }
}
