package Homework04.My;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public double getWeight() {
        return fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box<Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < .0001;
    }

    private boolean compareFruits(T fruit) {
        return fruits.get(0).getClass() != fruit.getClass();
    }

    public void addFruit(T fruit) {
        if (this.fruits.size() > 0)
            if (compareFruits(fruit)) {
                throw new RuntimeException("Фрукт и коробка не совместимы.");
            }
        fruits.add(fruit);
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void transfer(Box otherBox) {
        if (otherBox.getFruits().size() > 0) {
            if (compareFruits((T) otherBox.getFruits().get(0))) {
                throw new RuntimeException("Вы выбрали не ту коробку.");
            }
        }
        for (T fruit : fruits) {
            otherBox.getFruits().add(fruit);
        }
        fruits.clear();
    }
}
