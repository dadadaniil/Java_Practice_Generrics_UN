package entity;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        // 1. Create p1 instance - the purchase of 20 packages of milk with the price 1.70 Euro.
        Purchase p1 = new Purchase(new Product("Milk", BigDecimal.valueOf(1.70)), BigDecimal.valueOf(20));

        // 2. Output p1 and its cost with the PurchaseUtils instance pu1.
        PurchaseUtils pu1 = new PurchaseUtils(p1);
        pu1.printPurchase();
        pu1.printCost();

        // 3. Create p2 instance - the purchase of 12.5 kg of sugar with the price 3.00 Euro.
        Purchase p2 = new Purchase(new Product("Sugar", BigDecimal.valueOf(3.00)), BigDecimal.valueOf(12.5));

        // 4. Output the cost of p2 and the cost difference of p2 and p1.
        PurchaseUtils pu2 = new PurchaseUtils(p2);
        pu2.printCost();
        pu2.printCostDiff(pu1.getPurchase());

        // 5. Create p3 instance - the purchase of 60 kg of sugar with the price 2.80 Euro and the price discount 0.10 Euro.
        Purchase p3 = new Purchase(new DiscountProduct("Sugar", BigDecimal.valueOf(2.80), BigDecimal.valueOf(0.10)), BigDecimal.valueOf(60));

        // 6. Without a link to a Purchase instance, i.e. with the help of an anonymous object, create the PurchaseUtils instance pu4 for the gym workout for 2.25 months with the total cost 75.60 Euro and 5 participants.
        PurchaseUtils pu4 = new PurchaseUtils(new Purchase(new Service("Gym", BigDecimal.valueOf(75.60), 5), BigDecimal.valueOf(2.25)));

        // 7. Get the Service instance from the last purchase and output it.
        System.out.println(pu4.getPurchase().getItem().toString());

        // 8. Output the cost of the last purchase with a PurchaseUtils instance.
        pu4.printCost();

        // 9. Using a PurchaseUtils instance, output whether someone of p1, p3 or the last purchase has the same cost as the p2 purchase.
        pu2.printIsSameCost(p1, p3, pu4.getPurchase());
    }
}
