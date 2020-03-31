package purchase;

import java.util.ArrayList;
import java.util.List;

public class Clothes extends Purchase {
    private static double totalSum;
    private static final List<Purchase> clothesList = new ArrayList<>();

    public Clothes(String name, double price) {
        super(name, price);
    }
@Override
    public void addPriceToTotalSum() {
        totalSum += getPrice();
    }
@Override
    public void addPurchaseToPurchaseList(Purchase purchase) {
        clothesList.add(purchase);
    }

    public static List<Purchase> getPurchaseList() {
        return clothesList;
    }

    public static double getTotalSum() {
        return totalSum;
    }
}
