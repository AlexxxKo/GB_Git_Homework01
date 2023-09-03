package Homework01;

public class BottleOfWater extends Product {
    private double volume; // Объем

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой]\nНазвание: %s\nБрэнд: %s\nЦена: %.2f рублей\nОбъем: %.2f литров", name, brand, price, volume);
    }
}
