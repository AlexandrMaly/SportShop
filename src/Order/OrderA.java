package Order;

import Cap.CapColor;
import Cap.CapMaker;
import TShirt.TShirtColor;
import TShirt.TShirtMaker;

public class OrderA {
    private TShirtColor tShirtColor;
    private CapColor capColor;
    private TShirtMaker tShirtMaker;
    private CapMaker capMaker;
    private double totalPrice;

    public OrderA() {
        this.tShirtColor = TShirtColor.RED;
        this.capColor = CapColor.WHITE;
        this.tShirtMaker = TShirtMaker.ACTIVESPORT;
        this.capMaker = CapMaker.SMARTCAPS;

    }


    private double getTotalPrice() {
        totalPrice = tShirtColor.getPrice() + capColor.getPrice();
        return totalPrice;
    }

    @Override
    public String toString() {
        return "OrderA: " +
                "T-Shirt color = " + tShirtColor.getColor() +
                ", T-Shirt maker = " + tShirtMaker.getMaker() +
                ", T-Shirt price = " + tShirtColor.getPrice() +
                "\n" + "Cap color = " + capColor.getColor() +
                ", Cap maker = " + capMaker.getMaker() +
                ", Cap price = " + capColor.getPrice() +
                "\n" + "Total price: " + getTotalPrice();
    }
}
