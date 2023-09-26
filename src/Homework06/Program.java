package Homework06;


public class Program {
    /**
     * TODO: Переработать приложение в рамках принципа SRP
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ 1:");
        Order order = new Order();
        order.inputFromConsole();
        order.saveToJson();

        System.out.println();

        System.out.println("Введите заказ 2:");
        OrderV2 order2 = new OrderV2();
        InputFromConsoleV2 input = new InputFromConsoleV2(order2);
        input.inputFromConsole();
        SaveToJsonV2 save = new SaveToJsonV2(order2);
        save.saveToJson();
    }
}
