package Homework04.Lector;

/**
 * Абстрактный, базовый класс - фрукт (3a)
 */
public abstract class Fruit {
    private final float weight; // Вес фрукта (3d)

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
