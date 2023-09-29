package Homework07;

public class Student extends Applicant implements Observer {

    public Student(String name) {
        this.name = name;
        this.salary = 2000;
    }

    @Override
    public void recieveOffer(String nameCompany, String vacancy, int salary) {
        if (this.salary <= salary) {
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
