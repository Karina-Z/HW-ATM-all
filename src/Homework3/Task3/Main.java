package Homework3.Task3;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Karina", "Zaporozhets");
        System.out.println("The first employee: " + employee1.name + " " + employee1.surname + " " + employee1.ID);

        Employee employee2 = new Employee();
        employee2.setName("Ganna");
        employee2.setSurname("Chycherina");
        System.out.println("The second employee: " + employee2.name + " " + employee2.surname + " " + employee2.ID);

    }
}