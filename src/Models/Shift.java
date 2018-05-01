package Models;

public class Shift {

    private String type;



    private Date date;
    private Nurse nurse;
    private int id;

    public Shift(String type, Nurse nurse, int id) {
        this.type = type;
        this.nurse = nurse;
        this.id = id;
    }

}
