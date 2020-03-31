package purchase;

import java.util.ArrayList;
import java.util.List;

public class Other extends Purchase {
    private static double totalSum;
    private static final List<Purchase> otherList = new ArrayList<>();

    public Other(String name, double price) {
        super(name, price);
    }


    public static Purchase getNewPurchase(String name, double price) {
        return null;
    }

    @Override
    public void addPriceToTotalSum() {
        this.totalSum += getPrice();
    }

    @Override
    public void addPurchaseToPurchaseList(Purchase purchase) {
        otherList.add(purchase);
    }

    public static List<Purchase> getPurchaseList() {
        return otherList;
    }

    public static double getTotalSum() {
        return totalSum;
    }
}
