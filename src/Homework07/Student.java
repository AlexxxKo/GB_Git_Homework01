package Homework07;

public class Student extends Applicant implements Observer {

    public Student(String name) {
        this.name = name;
        this.salary = 2000;
        this.finderStatus = true;
    }

    @Override
    public void recieveOffer(String nameCompany, String vacancy, int salary) {
        if (this.salary <= salary) {
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
            this.finderStatus  = false;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }
}
