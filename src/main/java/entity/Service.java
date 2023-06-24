package entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Service extends AbstractPriceable {
    private final BigDecimal totalCost;
    private final int numberOfUsers;

    public Service(String name, BigDecimal totalCost, int numberOfUsers) {
        super(name);
        this.totalCost = totalCost;
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public BigDecimal getPrice() {
        return totalCost.divide(BigDecimal.valueOf(numberOfUsers), RoundingMode.CEILING);
    }

    @Override
    protected String fieldsToString() {
        return totalCost + ";" + numberOfUsers;
    }
}