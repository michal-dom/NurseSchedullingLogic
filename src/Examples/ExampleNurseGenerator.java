package Examples;

import Models.Nurse;

import java.util.ArrayList;

public class ExampleNurseGenerator {

    private ArrayList<Nurse> nurses = new ArrayList<Nurse>();

    public ExampleNurseGenerator() {

    }

    private void generate(){
        //Nurse n = new Nurse(0, "JULIA", "NOWAK", "normalna");

        nurses.add(new Nurse(1, "ZUZANNA", "KOWALSKA", "normalna"));
        nurses.add(new Nurse(2, "ZOFIA", "WISNIEWSKA", "normalna"));
        nurses.add(new Nurse(3, "MAJA", "WOJCIK", "normalna"));
        nurses.add(new Nurse(4, "HANNA", "KOWALCZYK", "normalna"));
        nurses.add(new Nurse(5, "AMELIA", "KAMINSKA", "normalna"));
        nurses.add(new Nurse(6, "ALICJA", "LEWANDOWSKA", "normalna"));
        nurses.add(new Nurse(7, "MARIA", "ZIELINSKA", "normalna"));
        nurses.add(new Nurse(8, "ALEKSANDRA", "WOZNIAK", "normalna"));
        nurses.add(new Nurse(9, "OLIWIA", "SZYMANSKA", "normalna"));
        nurses.add(new Nurse(10, "NATALIA", "DABROWSKA", "normalna"));
        nurses.add(new Nurse(11, "WIKTORIA", "KOZLOWSKA", "normalna"));
        nurses.add(new Nurse(12, "EMILIA", "JANKOWSKA", "bez_nocnych"));
        nurses.add(new Nurse(13, "ANTONINA", "WOJCIECHOWSKA", "normalna", 32));
        nurses.add(new Nurse(14, "LAURA", "KWIATKOWSKA", "normalna", 24));
        nurses.add(new Nurse(15, "POLA", "MAZUR", "normalna", 24));
        nurses.add(new Nurse(16, "IGA", "KRAWCZYK", "normalna", 24));
//        nurses.add(new Nurse(17, "ANNA", "KACZMAREK", "normalna"));
//        nurses.add(new Nurse(18, "LILIANA", "PIOTROWSKA", "normalna"));
//        nurses.add(new Nurse(19, "MARCELINA", "GRABOWSKA", "normalna"));
//        nurses.add(new Nurse(20, "GABRIELA", "PAWLOWSKA", "normalna"));
//        nurses.add(new Nurse(21, "MICHALINA", "MICHALSKA", "normalna"));
//        nurses.add(new Nurse(22, "KORNELIA", "ZAJAC", "normalna"));
//        nurses.add(new Nurse(23, "NIKOLA", "KROL", "normalna"));
//        nurses.add(new Nurse(24, "HELENA", "JABLONSKA", "normalna"));
//        nurses.add(new Nurse(25, "JULIA", "WIECZOREK", "normalna"));
//        nurses.add(new Nurse(26, "JULIA", "NOWAKOWSKA", "normalna"));
//        nurses.add(new Nurse(27, "MILENA", "MAJEWSKA", "normalna"));
//        nurses.add(new Nurse(28, "MARTYNA", "WROBEL", "normalna"));
//        nurses.add(new Nurse(29, "JAGODA", "STEPIEN", "normalna"));
//        nurses.add(new Nurse(30, "MAGDALENA", "OLSZEWSKA", "normalna"));

    }

    public ArrayList<Nurse> getNurses() {
        if(nurses.size() == 0){
            this.generate();
        }
        return nurses;
    }

    public ArrayList<Integer> getNursesId() {
        if(nurses == null){
            this.generate();
        }
        ArrayList<Integer> nurses_ids = new ArrayList<Integer>();

        for (int i = 0; i < nurses.size(); i++) {
            nurses_ids.add(nurses.get(i).getId());
        }

        return nurses_ids;
    }

    public Nurse getNurseById(int id){
        return nurses.get(id);
    }

    public void print(){
        if(nurses.size() == 0){
            this.generate();
        }
        for (int i = 0; i < nurses.size(); i++) {
            System.out.print(nurses.get(i).toString()+"\n");
        }
    }


    public void setNurses(ArrayList<Nurse> nurses) {

        this.nurses = nurses;
    }
}
