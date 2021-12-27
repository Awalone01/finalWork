package ru.skypro;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        addEmployee(new Employee ("Волков", "Александр", "Александрович", 1, 35_000f));
        addEmployee(new Employee ("Волкова", "Дарья", "Игоревна", 1, 20_000f));
        addEmployee(new Employee ("Тарабанько", "Наталья", "Николавна", 2, 40_000f));
        addEmployee(new Employee ("Тарабанько", "Георгий", "Эдуардович", 2, 25_000f));
        addEmployee(new Employee ("Дюмина", "Светлана", "Александровна", 3, 45_000f));
        addEmployee(new Employee ("Дюмина", "Наталья", "Юрьевна", 3, 35_000f));
        printEmployee();
        System.out.println("Общая сумма зарплат по сотрудникам " + allSalary() + " рублей.");
        System.out.println("Сотрудник с максимальной зарплатой " + employeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой " + employeeWithMinSalary());
        System.out.println("Средняя зарплата сотрудников " + averageSalary() + " рублей.");
        printFullName();

    }

    public static void printEmployee() {
        for (Employee employee:employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void printFullName() {
        for (Employee employee:employees) {
            if (employee != null) {
                System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getThirdName());
            }

        }
    }

    public static float allSalary() {
        float sum = 0;
        for (Employee employee:employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee employeeWithMaxSalary() {
        Employee result = null;
        float maxSalary = Integer.MIN_VALUE;
        for (Employee employee:employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
        }

    public static Employee employeeWithMinSalary() {
        Employee result = null;
        float minSalary = Integer.MAX_VALUE;
        for (Employee employee:employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float averageSalary() {
        int count = 0;
        for (Employee employee:employees) {
            if (employee != null) {
                count++;
            }
        }
        return allSalary() / count;
    }



    private static boolean addEmployee (Employee newEmployees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployees;
                return true;
            }
        }
        return false;
    }



}
