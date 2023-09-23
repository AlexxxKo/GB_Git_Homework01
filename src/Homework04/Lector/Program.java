package Homework04.Lector;

public class Program {
    public static void main(String[] args) {
        new Program().doWork();
    }

    public void doWork() {
        System.out.println("\n*** Фрукты ***\n");

        // Создадим коробку с 3 яблоками внутри
        Box<Apple> appleBox1 = new Box<>(
                new Apple(),
                new Apple(),
                new Apple()
        );

        // Создадим коробку с 500 яблоками внутри
        Box<Apple> appleBox2 = new Box<>();
        for (int i = 0; i < 500; i++) {
            appleBox2.add(new Apple());
        }

        // Создадим коробку с 2 апельсинами внутри
        Box<Orange> orangeBox1 = new Box<>(
                new Orange(),
                new Orange()
        );

        // Создадим коробку с 500 апельсинами внутри
        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 500; i++) {
            orangeBox2.add(new Orange());
        }

        // Отобразим общий вес фруктов по коробкам:
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());
        System.out.println();

        // Сравнение веса коробок:
        System.out.println(appleBox1.compare(orangeBox1));

        // Переложим фрукты из одной коробки в другую:
        orangeBox1.replaceAll(orangeBox2);
        // Результаты сортировки фруктов:
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());
    }
}
