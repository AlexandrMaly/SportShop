package Order;

import TShirt.TShirtColor;
import TShirt.TShirtMaker;

public class OrderTShirt {
    private TShirtColor color;
    private TShirtMaker maker;


    public OrderTShirt ( TShirtColor color, TShirtMaker maker) {
        this.color = color;
        this.maker = maker;
    }

    public TShirtColor getColor() {
        return color;
    }

    public TShirtMaker getMaker() {
        return maker;
    }


}
