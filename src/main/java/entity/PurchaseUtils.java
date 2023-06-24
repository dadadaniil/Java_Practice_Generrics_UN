package entity;

import java.math.BigDecimal;

public class PurchaseUtils<T extends Priceable, N extends Number> {
    private final Purchase<T, N> purchase;

    public PurchaseUtils(Purchase<T, N> purchase) {
        this.purchase = purchase;
    }

    public Purchase<T, N> getPurchase() {
        return purchase;
    }

    public void printPurchase() {
        System.out.println(purchase);
    }

    public void printCost() {
        System.out.println(purchase.getCost());
    }

    public void printCostDiff(Purchase<? extends Priceable, ? extends Number> p) {
        BigDecimal costDiff = purchase.getCost().subtract(p.getCost()).abs();
        System.out.println(costDiff);
    }

    public void printIsSameCost(Purchase<? extends Priceable, ? extends Number> ... purchases) {
        boolean isSameCost = false;
        for (Purchase<? extends Priceable, ? extends Number> p : purchases) {
            if (p.getCost().equals(purchase.getCost())) {
                isSameCost = true;
                break;
            }
        }
        System.out.println(isSameCost);
    }
}
