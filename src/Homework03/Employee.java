package Homework03;

/**
 * Работник
 */
public abstract class Employee implements Comparable<Employee> {
    /**
     * Имя
     */
    protected String name;
    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Ставка заработной платы
     */
    protected double salary;
    /**
     * Возраст
     */
    protected int age;

    public Employee(String name, String surName, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    /**
     * Расчёт среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s, %d лет", surName, name, age);
    }

    @Override
    public int compareTo(Employee o) {
        int suNameRes = surName.compareTo(o.surName);
        if (suNameRes == 0) {
            return name.compareTo(o.name);
        }
        else return suNameRes;
    }
}
