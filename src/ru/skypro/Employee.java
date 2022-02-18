package ru.skypro;

public class Employee {
    public static int employeeCount = 1;

    private String firstName;
    private String secondName;
    private String thirdName;
    private int department;
    private float salary;
    private int id;

    public Employee(String firstName, String secondName, String thirdName, int department, float salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.department = department;
        this.salary = salary;
        this.id = employeeCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setSalary() {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstNane='" + firstName + '\'' +
                ", secondName=" + secondName +
                ", thirdName='" + thirdName + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
