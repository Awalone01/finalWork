package ru.skypro;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2RTFDTM;

public class Employee {
    int salary;
    public String department;
    public EmployeeList employeeList;
    public static int employeeCount = 0;

    public Employee(EmployeeList employeeList, String department, int salary) {
        this.department = department;
        this.salary = salary;
        this.employeeList = employeeList;
        Employee.employeeCount++;
    }

    public String getDepartment() {
        return getDepartment();
    }

    public EmployeeList getEmployeeList() {
        return employeeList;
    }

    public int getSalary() {
        return getSalary();
    }

    @Override
    public String toString() {
        return employeeList +
                " зарплата - " + salary +
                " отдел в котором работает - " + department;
    }

    //    int id;
//    int i = id++;

//    public static int getEmployeeCount()
////    {
////        return Employee.employeeCount;
////
////    }
////
////    public static void setEmployeeCount(int employeeCount)
////    {
////        Employee.employeeCount = employeeCount;
////
////    }
}
