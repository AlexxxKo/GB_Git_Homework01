package Homework07;

public class Cleaner extends Applicant implements Observer {
    private String findVacancy = "Cleaner";

    public Cleaner(String name) {
        this.name = name;
        this.salary = 40000;
        this.finderStatus = true;
    }

    @Override
    public void recieveOffer(String nameCompany, String vacancy, int salary) {
        if (this.findVacancy == vacancy)
            if (this.salary <= salary) {
                System.out.printf("Уборщик %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                        name, nameCompany, vacancy, salary);
                this.salary = salary;
                this.finderStatus  = false;
            } else {
                System.out.printf("Уборщик %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                        name, nameCompany, vacancy, salary);
            }
    }
}
