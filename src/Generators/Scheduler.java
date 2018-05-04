package Generators;

import Examples.ExampleNurseGenerator;
import Models.Nurse;
import Models.Schedule;
import Models.Week;

import java.util.*;

public class Scheduler {

    private static final int NUM_NURSE = 16;
    private static final int NUM_WEEKS = 5;
    private static final int NUM_DAYS = 7;

    private ArrayList<Nurse> nurses = new ArrayList<Nurse>();
    ExampleNurseGenerator nurse_generator = new ExampleNurseGenerator();
    private HashMap<Integer, Integer> night_shift_stack = new HashMap<Integer, Integer>();
    private ArrayList<Integer[]> week_schedule = new ArrayList<Integer[]>();

    public Scheduler() {

        //nurses = nurse_generator.getNurses();
    }

    public void generateSchedule(){
        //week_schedule.clear();
        nurses = nurse_generator.getNurses();
        week_schedule.removeAll(week_schedule);
        night_shift_stack.clear();
        Random rand = new Random();
        int num_shifts = 0;
        int tmp_nurse_id = 0;
        int stopper = 0;
        //System.out.print("\n------\n");
        for (int i = 0; i < NUM_WEEKS; i++) {
            for (int j = 0; j < NUM_DAYS; j++) {
                num_shifts = (j == 6 || j == 5) ? 7 : 10;
                Integer[] day = new Integer[num_shifts];
                for (int k = 0; k < num_shifts; k++) {
                    //System.out.print("loop: " + i + "");
                    if(stopper > 1000000) {
                        //System.out.print("\ninterruption: infinite loop\n");
                        stopper = 0;
                        generateSchedule();
                    }
                    tmp_nurse_id = rand.nextInt(16)+1;
                    if(hardConstrant(day, tmp_nurse_id, j, k, i)){
                        day[k] = tmp_nurse_id;//dodajemy i lecimy dalej
                        stopper = 0;
                    } else {
                        k--;//ponawaimy losowanie
                        stopper++;
                    }
                    //stopper++;
                }
                week_schedule.add(day);
                //System.out.println(Arrays.toString(day));
//                System.out.print("\n");
            }
        }
        //System.out.print(week_schedule.toString());

    }
    /*
    * day#0 - pon * day#1 - wt * day#2 - sr * day#3 - czw * day#4 - pt * day#5 - sob * day#6 - nd
    * shift#0 - day * shift#1 - early * shift#2 - late * shift#3 - night
    */

    /*public void print(){
        for (int i = 0; i < week_schedule.size(); i++) {

        }
    }*/

    public boolean hardConstrant(Integer[] day, int id, int iday, int ishift, int iweek){
        if(oneNurseInDayCons(day, id) &&
                threeNightShiftCons(id, iday, ishift) &&
                noneNightShiftNurseCons(id, iday, ishift) &&
                workHoursCons(id, iday) &&
                consecutiveShiftsCons(id) &&
                hoursOfRestCons(id, ishift, iday, iweek)/**/
                ){
            return true;
        }else{
            return false;
        }
    }

    //2
    public boolean oneNurseInDayCons(Integer[] day, int id){
        if(Arrays.asList(day).contains(id)) return false;
        else return true;
    }
    //4,9
    public boolean threeNightShiftCons(int id, int iday, int ishift){
        boolean is_night;
        is_night = (iday == 6 || iday == 5) ? (ishift == 6) : (ishift == 9);
        if(!is_night){
            return true;
        } else {
            if(night_shift_stack.containsKey(id)){
                if (night_shift_stack.get(id) > 2){
                    return false;
                } else {
                    int tmp = night_shift_stack.get(id) + 1;
                    night_shift_stack.put(id, tmp);
                    return true;
                }
            } else {
                night_shift_stack.put(id, 1);
                return true;
            }
        }
    }
    //3
    public boolean workHoursCons(int id, int iday){
        Nurse nurse = nurses.get(id-1);
        if (iday == 0){
            for (Nurse n: nurses) {
                n.regenWorkHours();
            }
        }
        int work_hours;
        if(nurse.getWorkHours() > 0){
            work_hours = nurse.getWorkHours() - 8;
            nurse.setWorkHours(work_hours);
            return true;
        } else {
            return false;
        }
    }

    //5
    public boolean consecutiveShiftsCons(int id){
        int bound_up = week_schedule.size() > 6 ? week_schedule.size() - 6 : 0;

        int con_days = 0;
        for (int i = bound_up; i < week_schedule.size(); i++) {
            if(Arrays.asList(week_schedule.get(i)).contains(id)){
                con_days++;
                //System.out.print("+");
            } else {
                con_days = 0;
                //System.out.print("0");
            }
            if(con_days > 5){
                return false;
                //System.out.print("\ntu:\n");
            }
        }

        return true;
    }



    //11
    public boolean noneNightShiftNurseCons(int id, int iday, int ishift){
        boolean is_night;
        is_night = (iday == 6 || iday == 5) ? (ishift == 6 ? true : false) : (ishift == 9 ? true : false);
        if(is_night && id == 12){
            return false;
        } else {
            return true;
        }
    }
    public boolean sixDayInRowCons(){

        return true;
    }


    public boolean hoursOfRestCons(int id, int ishift, int iday, int iweek){
        int type_of_shift = typeOfShift(ishift, iday);

        int iday_before = ((iweek * 7) + iday) - 1 ;
        int ishift_before;

        if(iweek == 0 && iday == 0) return true;
        if(!Arrays.asList(week_schedule.get(iday_before)).contains(id)) return true;

        ishift_before = Arrays.asList(week_schedule.get(iday_before)).indexOf(id);
        int type_of_shift_before = typeOfShift(ishift_before, iday == 0 ? 6 : (iday - 1) );

        if(type_of_shift == 1){
            if(type_of_shift_before == 3 || type_of_shift_before == 3){
                return false;
            }
        }
        if(type_of_shift == 2){
            if(type_of_shift_before == 3){
                return false;
            }
        }
//        if(type_of_shift == 3){
//            System.out.print(" ok: ");
//        }

        return true;
    }

    public int typeOfShift(int ishift, int iday){
        int type_of_shift;
        if(iday == 6 || iday == 5){//weekend
            if(ishift == 6){
                type_of_shift = 3;
            } else if (ishift == 5 || ishift == 4){
                type_of_shift = 2;
            } else {
                type_of_shift = 1;
            }
        } else {
            if(ishift == 9){
                type_of_shift = 3;
            } else if (ishift == 8 || ishift == 7 || ishift == 6){
                type_of_shift = 2;
            } else {
                type_of_shift = 1;
            }
        }
        return type_of_shift;

    }

    public void print(){
        for ( Integer[] arr: week_schedule ) {
            System.out.print(Arrays.toString(arr));
            System.out.print("\n");
        }
    }


    public ArrayList<Integer[]> getWeek_schedule() {
        return week_schedule;
    }

    public void setWeek_schedule(ArrayList<Integer[]> week_schedule) {
        this.week_schedule = week_schedule;
    }
}

