package scheduler.test;

import Generators.Scheduler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeNightShiftConsTest {
    @Test
    public void test(){
        Scheduler scheduler = new Scheduler();
        int id = 2;
        int iday= 6;
        int ishift = 6;
        assertEquals(true, scheduler.threeNightShiftCons(id,iday,ishift),"first");
        assertEquals(true, scheduler.threeNightShiftCons(id,iday,ishift),"second");
        assertEquals(true, scheduler.threeNightShiftCons(id,iday,ishift),"third");
        assertEquals(false, scheduler.threeNightShiftCons(id,iday,ishift),"fourth");
    }

}