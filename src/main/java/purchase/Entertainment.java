package purchase;

import java.util.ArrayList;
import java.util.List;


public class Entertainment extends Purchase {
    private static double totalSum;
    private static final List<Purchase> entertainmentList = new ArrayList<>();

    public Entertainment(String name, double price) {
        super(name, price);
    }


    @Override
    public void addPriceToTotalSum() {
        this.totalSum += getPrice();
    }

    @Override
    public void addPurchaseToPurchaseList(Purchase purchase) {
        entertainmentList.add(purchase);
    }

    public static List<Purchase> getPurchaseList() {
        return entertainmentList;
    }

    public static double getTotalSum() {
        return totalSum;
    }

}
