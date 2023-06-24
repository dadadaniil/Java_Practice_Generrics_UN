package entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Purchase<T extends Priceable, N extends Number> {
    private final T item;
    private final N quantity;

    public Purchase(T item, N quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public T getItem() {
        return item;
    }

    public N getQuantity() {
        return quantity;
    }

    public BigDecimal getCost() {
        return item.getPrice().multiply(BigDecimal.valueOf(quantity.doubleValue()));
    }

    @Override
    public String toString() {
        return item + ";" + quantity;
    }
}
