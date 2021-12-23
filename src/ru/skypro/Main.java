package ru.skypro;

public class Main {

    public static void main(String[] args) {
        EmployeeList Volkov = new EmployeeList("Волков", "Александр", "Александрович");
        EmployeeList Volkova = new EmployeeList("Волкова", "Дарья", "Игоревна");

        Employee employee1 = new Employee(Volkov, "1", 15000);
        Employee employee2 = new Employee(Volkova, "2", 14000);
        Employee[] newEmployees = new Employee[10];
//        Employee newEmployee = new Employee(Volkov, "1", 15000);

        addEmployee(newEmployees, employee1);
        addEmployee(newEmployees, employee2);
        System.out.println(Employee.employeeCount);
        System.out.println(newEmployees[1]);


    }
    private static boolean addEmployee (Employee[] newEmployees, Employee employee) {
        for (int i = 0; i < newEmployees.length; i++) {
            if (newEmployees[i] == null) {
                newEmployees[i] = employee;
                return true;
            }
        }
        return false;
    }
}
