package entity;

import java.math.BigDecimal;
import java.util.Arrays;

public class PurchaseUtils {
    private Purchase purchase;

    public PurchaseUtils(Purchase purchase) {
        this.purchase = purchase;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void printPurchase() {
        System.out.println(purchase.getItem().getName() + "," + purchase.getQuantity());
    }

    public void printCost() {
        System.out.println("cost = " + purchase.getCost() + " Euro");
    }

    public void printCostDiff(Purchase p) {
        BigDecimal diff = purchase.getCost().subtract(p.getCost());
        String symbol = diff.signum() > 0 ? "+" : (diff.signum() < 0 ? "-" : "");
        System.out.println(symbol + " diff = " + diff.abs() + " Euro");
    }

    public void printIsSameCost(Purchase... purchases) {
        boolean sameCost = Arrays.stream(purchases).anyMatch(p -> p.getCost().compareTo(purchase.getCost()) == 0);
        System.out.println(sameCost);
    }

}
