package Models;

import Examples.ExampleNurseGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class Schedule {

    private ArrayList<Day> week;
    private ArrayList<ArrayList<Nurse>> nurse_lists;
    private ExampleNurseGenerator exampleNurseGenerator;

    public void generateNurseList(ArrayList<Integer[]> ids){
        ArrayList<Nurse> example_nurses;
        example_nurses = exampleNurseGenerator.getNurses();
        for ( Integer[] arr: ids ) {
            ArrayList<Nurse> tmp_nurses = new ArrayList<Nurse>();
            for ( Integer id: arr ) {
                tmp_nurses.add(example_nurses.get(id));
            }
            nurse_lists.add(tmp_nurses);
        }
    }

    public void addDay(Day day){
        week.add(day);
    }

    public Day getDay(int i){
        return week.get(i);
    }


}
