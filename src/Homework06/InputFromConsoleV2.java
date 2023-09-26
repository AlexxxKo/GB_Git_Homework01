package Homework06;

import java.util.Scanner;

public class InputFromConsoleV2 {

    public void inputFromConsole() {
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private OrderV2 order;

    public InputFromConsoleV2(OrderV2 order) {
        this.order = order;
    }
}
