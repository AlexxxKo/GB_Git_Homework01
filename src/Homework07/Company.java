package Homework07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Company {

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        for (String vacancy : vacansis) {
            jobAgency.sendOffer(new Vacancy(name, vacancy, salary));
        }
    }

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;
    private List<String> vacansis;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.vacansis = Arrays.asList("Java", "Cleaner");
        this.maxSalary = maxSalary;
    }
}
