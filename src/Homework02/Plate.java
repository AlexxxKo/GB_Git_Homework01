package Homework02;

public class Plate {
    private int food;

    public Plate() {
        this.food = 20;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int appetite) {
        this.food = appetite <= this.food ? this.food - appetite : 0;
    }

    public String info() {
        return "Plate: " + food;
    }

    public void fillFood() {
        this.food = 20;
    }
}
