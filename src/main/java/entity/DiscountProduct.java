package entity;

import java.math.BigDecimal;

public class DiscountProduct extends Product {
    private final BigDecimal discount;

    public DiscountProduct(String name, BigDecimal price, BigDecimal discount) {
        super(name, price);
        this.discount = discount;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().subtract(discount);
    }

    @Override
    protected String fieldsToString() {
        return super.getPrice() + ";" + discount;
    }
}
