package Homework03;

/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee{
    public Worker(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d лет; Рабочий; Среднемесячная заработная плата (фиксированная) %.2f у.е.",
                surName, name, age, salary);
    }
}
