package Homework06;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJsonV2 {

    public void saveToJson() {
        String fileName = "orderV2.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":\"" + order.getQnt() + "\",\n");
            writer.write("\"price\":\"" + order.getPrice() + "\",\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private OrderV2 order;

    public SaveToJsonV2(OrderV2 order) {
        this.order = order;
    }
}
