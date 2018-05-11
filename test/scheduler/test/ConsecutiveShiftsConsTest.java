package scheduler.test;

import Generators.Scheduler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveShiftsConsTest {
    @Test
    public void test(){
        Scheduler scheduler = new Scheduler();
        int id = 2;
        assertEquals(true, scheduler.consecutiveShiftsCons(3),"first");
        assertEquals(true, scheduler.consecutiveShiftsCons(4),"second");
        assertEquals(true, scheduler.consecutiveShiftsCons(5),"third");


    }

}