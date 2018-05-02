package scheduler.test;

import Generators.Scheduler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneNurseTest {

    @Test
    public void test(){
        Scheduler scheduler = new Scheduler();
        Integer[] array = {1, 5, 6, 8};
        int var = 2;
        assertEquals(true, scheduler.oneNurseInDayCons(array, var));

    }

}