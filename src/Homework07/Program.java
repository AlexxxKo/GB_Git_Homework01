package Homework07;

public class Program {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120_000);
        Company yandex = new Company("Yandex", jobAgency, 95_000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98_000);

        Student student1 = new Student("Petrov");
        Master master1 = new Master("Ivanov");
        Master master2 = new Master("Sidorov");
        Cleaner cleaner1 = new Cleaner("Vasiliev");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(cleaner1);
        for (int i = 0; i < 4; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }
}
