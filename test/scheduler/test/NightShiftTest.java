package scheduler.test;

import Generators.Scheduler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NightShiftTest {

    @Test
    public void test(){
        Scheduler scheduler = new Scheduler();
        assertEquals(true, scheduler.noneNightShiftNurseCons(13, 6, 6));
        assertEquals(true, scheduler.noneNightShiftNurseCons(10, 6, 6));
        assertEquals(true, scheduler.noneNightShiftNurseCons(10, 6, 6));
        assertEquals(true, scheduler.noneNightShiftNurseCons(10, 4, 6));
        assertEquals(true, scheduler.noneNightShiftNurseCons(10, 6, 2));
        assertEquals(true, scheduler.noneNightShiftNurseCons(7, 6, 6));
    }

}