package Models;

public class Nurse {
    private int id;
    private String name;
    private String surname;
    private String type;
    private int work_hours;
    private int work_hours_static;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Nurse(int id, String name, String surname, String type) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.work_hours = 40;
        this.work_hours_static = 40;

    }

    public Nurse(int id, String name, String surname, String type, int work_hours) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.work_hours = work_hours;
        this.work_hours_static = work_hours;
    }

    public int getWorkHours() {
        return work_hours;
    }

    public void regenWorkHours() {
        work_hours = work_hours_static;
    }

    public void setWorkHours(int work_hours) {
        this.work_hours = work_hours;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname + " - " + type;
    }
}
