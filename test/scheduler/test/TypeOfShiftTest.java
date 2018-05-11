package scheduler.test;

import Generators.Scheduler;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TypeOfShiftTest {

    @Test
    public void test() {
        Scheduler scheduler = new Scheduler();
        int ishift;
        int iday;

        assertEquals(1, scheduler.typeOfShift(1, 3));
        assertEquals(1, scheduler.typeOfShift(2, 3));
        assertEquals(1, scheduler.typeOfShift(3, 3));
        assertEquals(1, scheduler.typeOfShift(10, 11));


    }
}