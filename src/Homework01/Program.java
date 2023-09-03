package Homework01;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product bottleOfMilk1 = new BottleOfMilk("Домашнее", "ООО Молоко", 400.00, 1, 30);
        Product bottleOfMilk2 = new BottleOfMilk("Обезжиренное", "ООО Молоко", 500.00, 1, 10);
        Product bottleOfWater1 = new BottleOfWater("Без газа", "ООО Вода", 150.00, 1.5);
        Product bottleOfWater2 = new BottleOfWater("Без газа", "ООО Вода", 110.00, 1);
        Product bottleOfWater3 = new BottleOfWater("Сильно газированная", "ООО Вода", 160.00, 1);
        Product chocolate1 = new Chocolate("Алёнка", "Алёнка", 500, 20);
        Product chocolate2 = new Chocolate("Алёнка", "Алёнка", 600, 30);
        Product chocolate3 = new Chocolate("Обычная", "Алёнка", 350.3, 40);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Без газа", 1.5);
        if (bottleOfWater != null) {
            System.out.println("Вы получили: ");
            System.out.println(bottleOfWater.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        System.out.println();

        Chocolate chocolate = vendingMachine.getChocolate("Алёнка", 20);
        if (chocolate != null) {
            System.out.println("Вы получили: ");
            System.out.println(chocolate.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет в автомате.");
        }
    }
}
