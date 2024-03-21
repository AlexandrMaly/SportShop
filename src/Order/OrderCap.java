package Order;

import Cap.CapColor;
import Cap.CapMaker;

public class OrderCap {
    private CapColor color;
    private CapMaker maker;


    public OrderCap(CapColor color, CapMaker maker) {
        this.color = color;
        this.maker = maker;

    }

    public CapColor getColor() {
        return color;
    }

    public CapMaker getMaker() {
        return maker;
    }
}
