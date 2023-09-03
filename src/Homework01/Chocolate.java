package Homework01;

public class Chocolate extends Product {
    int calories; // калорийность

    public Chocolate(String name, String brand, double price, int calories) {
        super(name, brand, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадка]\nНазвание: %s\nБрэнд: %s\nЦена: %.2f рублей\nКалорийность: %d ккал", name, brand, price, calories);
    }
}
