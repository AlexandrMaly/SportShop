package Cap;

public enum CapMaker {
    SMARTCAPS ("Smart Caps"),
    FACTORY ("Factory");
    private final String maker;
    CapMaker(String maker) {
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    @Override
    public String toString() {
        return maker;
    }
}
