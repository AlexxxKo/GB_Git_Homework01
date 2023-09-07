package Homework02;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Persik", 7),
                new Cat("Lejeboka", 21),
                new Cat("Neposeda", 10),
                new Cat("Lucky", 2)
        };
        Plate plate = new Plate();

//        System.out.println(plate.info());

        for (Cat cat : cats) {
            if (cat.eat(plate.getFood())) {
                plate.setFood(cat.getAppetite());
            }
//            System.out.println(cat.getName() + " eat. " + plate.info());
        }

        for (Cat cat : cats) {
            System.out.println(cat.getInfo());
        }

//        plate.fillFood();
//        System.out.println();
//        System.out.println(plate.info());
    }
}
