package Generators;

import Examples.ExampleNurseGenerator;
import Models.Nurse;
import Models.Schedule;
import Models.Week;

import java.util.ArrayList;
import java.util.Random;

public class Scheduler {

    private static final int NUM_NURSE = 30;
    private static final int NUM_SHIFTS = 4;
    private static final int NUM_DAYS = 7;


    private int num_nurse;
    private int num_days;
    private int num_shifts;
    ExampleNurseGenerator nurses = new ExampleNurseGenerator();

    //private Week week;

    private ArrayList<int[]> week = new ArrayList<int[]>();

    private int[][] arr = new int[NUM_DAYS][NUM_SHIFTS];

    public Scheduler(int num_nurse, int num_days, int num_shifts) {
        this.num_nurse = num_nurse;
        this.num_days = num_days;
        this.num_shifts = num_shifts;
    }


    /*public void randDay(int[] shifts_in_day){
        Random rand = new Random();
        int tmp;
        for (int j = 0; j < num_shifts; j++) {
            tmp = rand.nextInt(30);
            if(oneNurseInDayCons(shifts_in_day, tmp)){
                System.out.print("tmp: " + tmp + "\t ");
                shifts_in_day[j] = (tmp);
            } else {
                randDay(shifts_in_day);
            }
        }

    }*/

    public int[] randDay(){
        Random rand = new Random();
        int[] shifts_in_day = new int[4];
        int tmp;
        for (int j = 0; j < num_shifts; j++) {
            tmp = rand.nextInt(30);
            shifts_in_day[j] = tmp;
        }
        return shifts_in_day;
    }


    public void randWeek(){
        int[] shifts_in_day = new int[4];

        for(int i = 0; i < num_days; i++ ){
            shifts_in_day = randDay();
            /*System.out.print(shifts_in_day[0] + " " +
                    shifts_in_day[1] + " " +
                    shifts_in_day[2] + " " +
                    shifts_in_day[3] +"\n");*/

            if(oneNurseInDayCons(shifts_in_day)){
                arr[i] = shifts_in_day;
            }else{
                i--;
            }
        }
    }

    /*-------------------constrant-------------------*/
    //2
    public boolean oneNurseInDayCons(int[] day){
        int[] tmp = new int[4];
        for (int i = 0; i < NUM_SHIFTS; i++) {
            for (int j = i + 1 ; j < NUM_SHIFTS; j++) {
                if (day[i] == day[j]) { // got the duplicate element
                    return false;
                }
            }
        }
        return true;
    }





    public void printWeek(){
        //int[] shifts_in_day = new int[4];
        for(int i = 0; i < num_days; i++ ){
            //shifts_in_day = week.get(i);
            System.out.print("Day no: " + i + "\t ");
            for (int j = 0; j < num_shifts; j++) {
                System.out.print(arr[i][j] + "\t\t");

            }
            System.out.print("\n");
        }
    }
}

