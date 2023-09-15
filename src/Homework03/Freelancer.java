package Homework03;

/**
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee {
    int hoursWorked;

    public Freelancer(String name, String surName, int age, double salary, int hoursWorked) {
        super(name, surName, age, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d лет; Фрилансер; За %d часов работы зарплата %.2f у.е.",
                surName, name, age, hoursWorked, calculateSalary());
    }
}
