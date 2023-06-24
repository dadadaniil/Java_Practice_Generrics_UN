package entity;

public abstract class AbstractPriceable implements Priceable {
    private final String name;

    public AbstractPriceable(String name) {
        this.name = name;
    }

    protected abstract String fieldsToString();

    public String toString() {
        return name + ";" + fieldsToString() + ";" + getPrice();
    }
}