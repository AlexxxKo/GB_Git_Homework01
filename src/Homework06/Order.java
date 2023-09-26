package Homework06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    // region Public methods
    public void inputFromConsole() {
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + clientName + "\",\n");
            writer.write("\"product\":\"" + product + "\",\n");
            writer.write("\"qnt\":\"" + qnt + "\",\n");
            writer.write("\"price\":\"" + price + "\",\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    // endregion

    // region Fields
    private String clientName;
    private String product;
    private int qnt;
    private int price;
    // endregion

    // region Constructors
    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Order() {};
    // endregion

    // region getters and setters
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }
    // endregion
}
