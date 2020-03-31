package purchase;

import java.util.ArrayList;
import java.util.List;

public class Food extends Purchase {
    private static double totalSum;
    private static final List<Purchase> foodList = new ArrayList<>();

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void addPriceToTotalSum() {
        this.totalSum += getPrice();
    }

    @Override
    public void addPurchaseToPurchaseList(Purchase purchase) {
        foodList.add(purchase);
    }

    public static List<Purchase> getPurchaseList() {
        return foodList;
    }

    public static double getTotalSum() {
        return totalSum;
    }

}
