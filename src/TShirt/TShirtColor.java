package TShirt;

public enum TShirtColor {
    RED("Red", 14.00),
    BLUE("Blue", 10.00);

    private final String color;
    private final double price;


    TShirtColor(String color, double price){
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "T-Shirt: color-" + color +
                ", price-" + price;
    }
}
