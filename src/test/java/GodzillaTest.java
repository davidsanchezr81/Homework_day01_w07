import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GodzillaTest {

    private Godzilla godzilla;


    @Before
    public void before(){
        godzilla = new Godzilla("Burning Godzilla", 15, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Burning Godzilla", godzilla.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(15, godzilla.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(3, godzilla.getAttackValue());
    }

    @Test
    public void canRoarScream(){
        assertEquals("Roar, I'll kill you all", godzilla.roar("I'll kill you all"));
    }
}

