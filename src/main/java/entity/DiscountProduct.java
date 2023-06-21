package entity;

import java.math.BigDecimal;

public class DiscountProduct extends Product {
    private BigDecimal discount;

    public DiscountProduct(String name, BigDecimal price, BigDecimal discount) {
        super(name, price.subtract(discount));
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }
}
