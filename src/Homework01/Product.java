package Homework01;

/**
 * Товар
 */
public class Product {
    protected String name; // Наименование
    protected String brand; // Изготовитель
    protected double price; // Стоимость

    public Product() {
        this("Noname");
    }

    public Product(String name) {
        this(name, "Noname");
    }

    public Product(String name, String brand) {
        this(name, brand, 100);
    }

    public Product(String name, String brand, double price) {
        checkPrice(price);
        checkName(name);
        checkBrand(brand);

//        if (price < 100) {
//            this.price = 100;
//        } else this.price = price;
//
//        if (name == null || name.length() < 3) {
//            this.name = "Noname";
//        } else this.name = name;
//
//        if (brand == null || brand.length() < 3) {
//            this.brand = "Noname";
//        } else this.brand = brand;

//        this.name = name;
//        this.brand = brand;
//        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f рублей", name, brand, price);
    }

    private void checkPrice(double price) {
        if (price < 100) {
            throw new RuntimeException("Некорректная цена товара");
        }
        this.price = price;
    }

    private void checkName(String name) {
        if (name == null || name.length() < 3) {
            throw new RuntimeException("Слишком короткое имя");
        }
        this.name = name;
    }

    private void checkBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            throw new RuntimeException("Слишком короткое имя брэнда");
        }
        this.brand = brand;
    }
}
