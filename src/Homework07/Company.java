package Homework07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {
    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;
    private List<Vacancy> vacancies;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.vacancies = new ArrayList<>();
    }
}
