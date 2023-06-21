package entity;

import java.math.BigDecimal;

public class Product extends Item {
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        super(name);
        this.price = price;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
