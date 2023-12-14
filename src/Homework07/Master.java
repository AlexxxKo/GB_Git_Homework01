package Homework07;

public class Master extends Applicant implements Observer {
    private String findVacancy = "Java";

    public Master(String name) {
        this.name = name;
        this.salary = 80000;
    }

    @Override
    public void recieveOffer(String nameCompany, String vacancy, int salary) {
        if (this.findVacancy == vacancy)
            if (this.salary <= salary) {
                System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                        name, nameCompany, vacancy, salary);
                this.salary = salary;
            } else {
                System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                        name, nameCompany, vacancy, salary);
            }
    }
}
