package scheduler.test;

import Generators.Scheduler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoneNightShiftNurseTest {
    @Test
    public void test(){
        Scheduler scheduler = new Scheduler();
        int id = 2;
        int iday= 6;
        int ishift = 6;
        assertEquals(true, scheduler.noneNightShiftNurseCons(id,iday,ishift),"first");
    }

}