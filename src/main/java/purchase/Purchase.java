package purchase;

public abstract class Purchase {
    protected String name;
    protected double price;


    public Purchase(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void addPriceToTotalSum();

    public abstract void addPurchaseToPurchaseList(Purchase purchase);

    @Override
    public String toString() {
        return name + " $" + price;
    }
}
