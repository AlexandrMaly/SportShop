package Order;

import Cap.CapColor;
import Cap.CapMaker;
import TShirt.TShirtColor;
import TShirt.TShirtMaker;

public class OrderB {
    private TShirtColor tShirtColor;
    private CapColor capColor;
    private TShirtMaker tShirtMaker;
    private CapMaker capMaker;
    private double totalPrice;

    public OrderB() {
        this.tShirtColor = TShirtColor.BLUE;
        this.capColor = CapColor.BLACK;
        this.tShirtMaker = TShirtMaker.ACTIVESPORT;
        this.capMaker = CapMaker.SMARTCAPS;

    }


    private double getTotalPrice() {
        totalPrice = tShirtColor.getPrice() + capColor.getPrice();
        return totalPrice;
    }

    @Override
    public String toString() {
        return "OrderB: " +
                "T-Shirt color = " + tShirtColor.getColor() +
                ", T-Shirt maker = " + tShirtMaker.getMaker() +
                ", T-Shirt price = " + tShirtColor.getPrice() +
                "\n" + "Cap color = " + capColor.getColor() +
                ", Cap maker = " + capMaker.getMaker() +
                ", Cap price = " + capColor.getPrice() +
                "\n" + "Total price: " + getTotalPrice();
    }

}
