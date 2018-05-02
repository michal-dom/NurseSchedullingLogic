import Examples.ExampleNurseGenerator;
import Generators.Scheduler;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scheduler s = new Scheduler();
        Random rand = new Random();
        //ExampleNurseGenerator generator = new ExampleNurseGenerator();
        //generator.print();
        s.generateSchedule();

    }
}
