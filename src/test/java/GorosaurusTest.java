import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GorosaurusTest {

    private Gorosaurus gorosaurus;

    @Before
    public void before(){
        gorosaurus = new Gorosaurus("Smashing Gorosaurus", 20, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Smashing Gorosaurus", gorosaurus.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(20, gorosaurus.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(5, gorosaurus.getAttackValue());
    }

    @Test
    public void canRoarScream(){
        assertEquals("Roar, I'll smash you all", gorosaurus.roar("I'll smash you all"));
    }

}
