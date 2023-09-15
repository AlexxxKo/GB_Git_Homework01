package Homework03;

import java.util.Arrays;
import java.util.Random;

public class Program {
    private static Random random = new Random();

    public static Employee generateWorker() {
        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salaryIndex = random.nextInt(200, 500);
        int ageIndex = random.nextInt(18, 70);
        int typeIndex = random.nextInt(0, 2);

        if (typeIndex == 0) {
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], ageIndex, 100 * salaryIndex);
        }
        else {
            int hoursIndex = random.nextInt(0, 184);
            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], ageIndex, salaryIndex, hoursIndex);
        }
    }

    public static Employee[] generateWorkers(int count) {
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateWorker();
        }
        return workers;
    }

    public static void main(String[] args) {
        Employee[] workers = generateWorkers(12);

        System.out.println("Начальный список");
        for (Employee worker: workers) {
            System.out.println(worker);
        }

        System.out.println();

        Arrays.sort(workers, new SalaryComparator());

        System.out.println("Список, отсортированный по зарплате");
        for (Employee worker: workers) {
            System.out.println(worker);
        }

        System.out.println();

        Arrays.sort(workers);
        System.out.println("Список, отсортированный по алфавиту");
        for (Employee worker: workers) {
            System.out.println(worker);
        }

        System.out.println();

        Arrays.sort(workers, new AgeComparator());
        System.out.println("Список, отсортированный по возрасту");
        for (Employee worker: workers) {
            System.out.println(worker);
        }
    }
}
