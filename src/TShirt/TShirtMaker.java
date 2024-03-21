package TShirt;

public enum TShirtMaker {
    ACTIVESPORT ("Active Sport"),
    CHINESEFACTORY ("Chinese factory");
    private final String maker;
    TShirtMaker(String maker) {
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
