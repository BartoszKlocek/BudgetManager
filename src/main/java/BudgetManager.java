import purchase.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BudgetManager {
    private double balance;
    private String name;
    private double price;
    private Scanner scannerDouble;
    private Scanner scannerString;
    private static double totalSum;
    private static final List<Purchase> allPurchaseList = new ArrayList<>();

    public BudgetManager() {
        this.scannerDouble = new Scanner(System.in);
        this.scannerString = new Scanner(System.in);
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void addIncome(double value) {
        if (value > 0 && value < Double.MAX_VALUE) {
            balance += value;
            System.out.println("Income was added!\n");
        }
    }

    public void readPurchase(Scanner scanner1, Scanner scanner2) {
        System.out.println("Enter purchase name:");
        this.name = scanner1.nextLine().trim();
        System.out.println("Enter its price:");
        this.price = scanner2.nextDouble();
        System.out.println("Purchase was added!\n");
    }

    public void printPurchaseList(List<Purchase> purchaseList) {
        if (purchaseList.size() > 0) {
            purchaseList.forEach(System.out::println);
        } else {
            System.out.println("Purchase list is empty\n");
        }
    }

    public boolean processAction() {
        chooseAction();
        int number = scannerDouble.nextInt();
        switch (number) {
            case 1:
                System.out.println();
                System.out.println("Enter Income: ");
                addIncome(scannerDouble.nextDouble());
                break;
            case 2:
                System.out.println();
                processPurchaseAction();
                break;

            case 3:
                System.out.println();
                processPurchasesListAction();
                break;
            case 4:
                System.out.println();
                System.out.printf("Balance: $%.2f", getBalance());
                System.out.println("\n");
                break;
            case 0:
                System.out.println();
                System.out.println("Bye!");
                return false;
            default:
                System.out.println();
                System.out.println("not exists such action");
                break;
        }
        return true;
    }

    public boolean processPurchaseAction() {
        while (true) {
            choosePurchaseAction();
            switch (scannerDouble.nextInt()) {
                case 1:
                    System.out.println();
                    readPurchase(scannerString, scannerDouble);
                    Food food = new Food(this.name, this.price);
                    food.addPurchaseToPurchaseList(food);
                    food.addPriceToTotalSum();
                    allPurchaseList.add(food);
                    this.totalSum += food.getPrice();
                    this.balance -= food.getPrice();
                    break;
                case 2:
                    System.out.println();
                    readPurchase(scannerString, scannerDouble);
                    Clothes clothes = new Clothes(this.name, this.price);
                    clothes.addPurchaseToPurchaseList(clothes);
                    clothes.addPriceToTotalSum();
                    allPurchaseList.add(clothes);
                    this.totalSum += clothes.getPrice();
                    this.balance -= clothes.getPrice();
                    break;
                case 3:
                    System.out.println();
                    readPurchase(scannerString, scannerDouble);
                    Entertainment entertainment = new Entertainment(this.name, this.price);
                    entertainment.addPurchaseToPurchaseList(entertainment);
                    entertainment.addPriceToTotalSum();
                    allPurchaseList.add(entertainment);
                    this.totalSum += entertainment.getPrice();
                    this.balance -= entertainment.getPrice();
                    break;
                case 4:
                    System.out.println();
                    readPurchase(scannerString, scannerDouble);
                    Other other = new Other(this.name, this.price);
                    other.addPurchaseToPurchaseList(other);
                    other.addPriceToTotalSum();
                    allPurchaseList.add(other);
                    this.totalSum += other.getPrice();
                    this.balance -= other.getPrice();
                    break;
                case 5:
                    System.out.println();
                    return false;
            }
        }
    }

    public boolean processPurchasesListAction() {
        while (true) {
            choosePurchasesListAction();
            switch (scannerDouble.nextInt()) {
                case 1:
                    System.out.println();
                    System.out.println("Food:");
                    printPurchaseList(Food.getPurchaseList());
                    System.out.printf("total sum: $%.2f", Food.getTotalSum());
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Clothes:");
                    printPurchaseList(Clothes.getPurchaseList());
                    System.out.printf("total sum: $%.2f", Clothes.getTotalSum());
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Entertainment:");
                    printPurchaseList(Entertainment.getPurchaseList());
                    System.out.printf("total sum: $%.2f", Entertainment.getTotalSum());
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Other:");
                    printPurchaseList(Other.getPurchaseList());
                    System.out.printf("total sum: $%.2f", Other.getTotalSum());
                    System.out.println();
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("All:");
                    printPurchaseList(allPurchaseList);
                    System.out.printf("total sum: $%.2f", totalSum);
                    System.out.println();
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    return false;

            }
        }
    }

    public void chooseAction() {
        System.out.println("Choose your action:");
        System.out.println("1) Add income");
        System.out.println("2) Add purchase");
        System.out.println("3) Show list of purchase");
        System.out.println("4) Balance");
        System.out.println("0) Exit");
    }

    public void choosePurchaseAction() {
        System.out.println("Choose the type of purchase:");
        System.out.println("1) Food");
        System.out.println("2) Clothes");
        System.out.println("3) Entertainment");
        System.out.println("4) Other");
        System.out.println("5) Back");
    }

    public void choosePurchasesListAction() {
        System.out.println("Choose the type of purchase:");
        System.out.println("1) Food");
        System.out.println("2) Clothes");
        System.out.println("3) Entertainment");
        System.out.println("4) Other");
        System.out.println("5) All");
        System.out.println("6) Back");
    }
}