package Homework02;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public boolean eat(int food) {
        this.satiety = food - this.appetite > 0;
        return this.satiety;
    }

    public String getInfo() {
        return "\nName: " + this.name + "; Satiety: " + this.satiety + ".";
    }
}
