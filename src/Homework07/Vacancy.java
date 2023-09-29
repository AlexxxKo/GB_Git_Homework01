package Homework07;

public class Vacancy implements IVacancy {
    private String name;
    private String companyName;
    private int salary;

    public Vacancy(String companyName, String name, int salary) {
        this.companyName = companyName;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
