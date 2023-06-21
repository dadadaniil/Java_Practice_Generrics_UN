package entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Purchase {
    private Item item;
    private BigDecimal quantity;

    public Purchase(Item item, BigDecimal quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getCost() {
        return item.getPrice().multiply(quantity).setScale(2, RoundingMode.HALF_UP);
    }
}

