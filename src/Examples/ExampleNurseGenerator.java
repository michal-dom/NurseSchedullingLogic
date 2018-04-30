package Examples;

import Models.Nurse;

import java.util.ArrayList;

public class ExampleNurseGenerator {

    private ArrayList<Nurse> nurses;

    private void generate(){
        nurses.add(new Nurse(0, "JULIA", "NOWAK", "normalna"));
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
        nurses.add(new Nurse(12, "EMILIA", "JANKOWSKA", "normalna"));
        nurses.add(new Nurse(13, "ANTONINA", "WOJCIECHOWSKA", "normalna"));
        nurses.add(new Nurse(14, "LAURA", "KWIATKOWSKA", "normalna"));
        nurses.add(new Nurse(15, "POLA", "MAZUR", "normalna"));
        nurses.add(new Nurse(16, "IGA", "KRAWCZYK", "normalna"));
        nurses.add(new Nurse(17, "ANNA", "KACZMAREK", "normalna"));
        nurses.add(new Nurse(18, "LILIANA", "PIOTROWSKA", "normalna"));
        nurses.add(new Nurse(19, "MARCELINA", "GRABOWSKA", "normalna"));
        nurses.add(new Nurse(20, "GABRIELA", "PAWLOWSKA", "normalna"));
        nurses.add(new Nurse(21, "MICHALINA", "MICHALSKA", "normalna"));
        nurses.add(new Nurse(22, "KORNELIA", "ZAJAC", "normalna"));
        nurses.add(new Nurse(23, "NIKOLA", "KROL", "normalna"));
        nurses.add(new Nurse(24, "HELENA", "JABLONSKA", "normalna"));
        nurses.add(new Nurse(25, "JULIA", "WIECZOREK", "normalna"));
        nurses.add(new Nurse(26, "JULIA", "NOWAKOWSKA", "normalna"));
        nurses.add(new Nurse(27, "MILENA", "MAJEWSKA", "normalna"));
        nurses.add(new Nurse(28, "MARTYNA", "WROBEL", "normalna"));
        nurses.add(new Nurse(29, "JAGODA", "STEPIEN", "normalna"));
        nurses.add(new Nurse(30, "MAGDALENA", "OLSZEWSKA", "normalna"));

    }

    public ArrayList<Nurse> getNurses() {
        if(nurses == null){
            this.generate();
        }
        return nurses;
    }

    public void setNurses(ArrayList<Nurse> nurses) {
        this.nurses = nurses;
    }
}
