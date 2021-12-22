package ru.skypro;

public class Employee {

    public static int employeeCount = 0;
    public Employee()
    {
        Employee.employeeCount++;
    }
//    int id;
//    int i = id++;

    public static int getEmployeeCount()
    {
        return Employee.employeeCount;

    }

    public static void setEmployeeCount(int employeeCount)
    {
        Employee.employeeCount = employeeCount;

    }
}
