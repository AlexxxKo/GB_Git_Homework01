package Homework04;

public class Program {
    public static void main(String[] args) {
        Box box1 = new Box<>();
        Box box2 = new Box<>();

        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
//        box1.addFruit(new Orange());  // Exception
        System.out.println(box1.getWeight());

        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        System.out.println(box2.getWeight());

        /** Вес разный */
        System.out.println(box1.compare(box2) ? "Коробки весят одинаково" : "Вес коробок различается");

        System.out.println();

        /** Вес одинаковый */
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2) ? "Коробки весят одинаково" : "Вес коробок различается");

        System.out.println();
        /** Перемещение */
//        box1.transfer(box2);  // Exception

        Box box3 = new Box<>();
        System.out.printf("Размер box1 до перемещения: %d\n", box1.getFruits().size());
        System.out.printf("Размер box3 до перемещения: %d\n", box3.getFruits().size());
        box1.transfer(box3);
        System.out.printf("Размер box1 после перемещения: %d\n", box1.getFruits().size());
        System.out.printf("Размер box3 после перемещения: %d\n", box3.getFruits().size());

        System.out.println();

        /** Перемещение в непустую коробку */
        box1.addFruit(new Apple());
        System.out.printf("Размер box1 до перемещения: %d\n", box1.getFruits().size());
        System.out.printf("Размер box3 до перемещения: %d\n", box3.getFruits().size());
        box3.transfer(box1);
        System.out.printf("Размер box1 после перемещения: %d\n", box1.getFruits().size());
        System.out.printf("Размер box3 после перемещения: %d\n", box3.getFruits().size());
    }
}
