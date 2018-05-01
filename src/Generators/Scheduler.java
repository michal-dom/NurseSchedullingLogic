package Generators;

import Examples.ExampleNurseGenerator;
import Models.Schedule;
import Models.Week;

import java.util.ArrayList;
import java.util.Random;

public class Scheduler {


    private int num_nurse;
    private int num_days;
    private int num_shifts;

    //private Week week;

    private ArrayList<ArrayList<Integer>> week = new ArrayList<ArrayList<Integer>>();
    private int[][] arr = new int[7][4];

    public Scheduler(int num_nurse, int num_days, int num_shifts) {
        this.num_nurse = num_nurse;
        this.num_days = num_days;
        this.num_shifts = num_shifts;
    }


    public void randWeek(){
        ExampleNurseGenerator nurses = new ExampleNurseGenerator();
        ArrayList<Integer> nurses_ids = nurses.getNursesId();
        Random rand = new Random();
        for(int i = 0; i < num_days; i++ ){
            for (int j = 0; j < num_shifts; j++) {
                //arr[i][j] = nurses_ids.get(rand.nextInt(30));
                arr[i][j] = rand.nextInt(30);
            }
        }
    }

    public void printWeek(){
        for(int i = 0; i < num_days; i++ ){
            for (int j = 0; j < num_shifts; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

