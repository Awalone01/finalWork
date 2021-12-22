package ru.skypro;

public class Main {

    public static void main(String[] args) {
        EmployeeList Volkov = new EmployeeList
                ("Волков", "Александр", "Александрович");
        Employee[] employees = new Employee[10];
        System.out.println(Volkov);
    }
}
