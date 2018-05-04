import Examples.ExampleNurseGenerator;
import Generators.Scheduler;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scheduler s = new Scheduler();
        Random rand = new Random();
        //ExampleNurseGenerator generator = new ExampleNurseGenerator();
        //generator.print();
        long start_time = System.nanoTime();
        s.generateSchedule();
        long end_time = System.nanoTime();

        s.print();
        double difference = (end_time - start_time) / 1e6;
        System.out.print("czas szedulingu: " + difference);
    }
}
