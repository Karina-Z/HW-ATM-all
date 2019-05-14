package Homework3.Task3;
import java.util.Random;

public class Employee {
    String name;
    String surname;
    int ID;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    Random random = new Random();

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = random.nextInt(10000);
    }

    public Employee() {
        this.ID = random.nextInt(10000);
    }
}
