package ru.skypro;

public class EmployeeList {
    private final String firstName;
    private final String secondName;
    private final String thirdName;

    public EmployeeList(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public String getFirstName() {
        return getFirstName();
    }
    public String getSecondName() {
        return getSecondName();
    }
    public String getThirdName() {
        return getThirdName();
    }

    @Override
    public String toString() {
        return "Ф.И.О. сотрудника - " + firstName + " " + secondName + " " + thirdName;
    }
}
