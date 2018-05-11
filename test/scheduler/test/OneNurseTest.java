package scheduler.test;

import Generators.Scheduler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneNurseTest {

    @Test
    public void test(){
        Scheduler scheduler = new Scheduler();
        Integer[] day = {1, 5, 6, 8};
        int id = 2;
        assertEquals(true, scheduler.oneNurseInDayCons(day,id));
        id = 1;
        assertEquals(false, scheduler.oneNurseInDayCons(day,id));
        day = new Integer[] {1, 1, 6, 8};
        assertEquals(false, scheduler.oneNurseInDayCons(day,id));



    }

}