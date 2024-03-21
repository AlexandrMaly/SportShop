package Cap;

public enum CapColor {
    WHITE("White", 8.50),
    BLACK("Black", 10.00);

    private final String color;
    private final double price;

    CapColor(String color, double price){
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
        return "Cap: color-" + color +
                ", price-" + price;
    }
}
