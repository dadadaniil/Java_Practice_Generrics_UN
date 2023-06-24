package entity;

import java.math.BigDecimal;

public class Product extends AbstractPriceable {
    private final BigDecimal price;

    public Product(String name, BigDecimal price) {
        super(name);
        this.price = price;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    protected String fieldsToString() {
        return price.toString();
    }
}
