package entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Service extends Item {
    private BigDecimal totalCost;
    private int numberOfUsers;

    public Service(String name, BigDecimal totalCost, int numberOfUsers) {
        super(name);
        this.totalCost = totalCost;
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public BigDecimal getPrice() {
        return totalCost.divide(new BigDecimal(numberOfUsers), RoundingMode.UP);
    }

    @Override
    public String toString() {
        return "Service{" +
                "name=" + getName() +
                ", totalCost=" + totalCost +
                ", numberOfUsers=" + numberOfUsers +
                ", pricePerUser=" + getPrice() +
                '}';
    }
}
