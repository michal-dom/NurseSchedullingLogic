package Generators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SoftConstraintsHandler {

    public int standAloneShiftCons(ArrayList<Integer[]> schedule){
        int penalty = 0;
        for (int i = 1; i < schedule.size()-1; i++) {
            for (Integer id: schedule.get(i) ) {
                if(!Arrays.asList(schedule.get(i-1)).contains(id) && !Arrays.asList(schedule.get(i+1)).contains(id)){
                    penalty += 1000;
                }
            }
        }
        return penalty;
    }

    public int nightShiftsSeriesCons(ArrayList<Integer[]> schedule){
        int penalty = 0;

        for (int i = 1; i < schedule.size()-1; i++) {
            //int j = (schedule.get(i).length%5 == 0 || schedule.get(i).length%6 == 6 ) ? 9 : 6;
            Integer[] day = schedule.get(i);
            Integer[] yesterday = schedule.get(i-1);
            Integer[] tomorrow = schedule.get(i+1);

            if(day[day.length-1] == yesterday[yesterday.length-1] || day[day.length-1] == tomorrow[tomorrow.length-1]){
                if(day[day.length-1] == 15 || day[day.length-1] == 14 || day[day.length-1] == 13){
                    penalty += 1000;
                } else {
                    penalty += 10;
                }
            }
        }
        return penalty;
    }

    public int nightAfterEarlyCons(ArrayList<Integer[]> schedule){
        int penalty = 0;
        for (int i = 1; i < schedule.size(); i++) {
            Integer[] day = schedule.get(i);
            Integer[] yesterday = schedule.get(i-1);

            if(day[day.length-1] == yesterday[0]){
                penalty += 1;

            }
        }
        return penalty;
    }









}
