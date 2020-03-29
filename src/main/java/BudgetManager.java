import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BudgetManager {
    private double balance;
    private Scanner scanner;
    private Scanner scannerString;
    private List<String> purchaseList;

    public BudgetManager() {
        this.scanner = new Scanner(System.in);
        this.scannerString = new Scanner(System.in);
        this.purchaseList = new ArrayList<>();
        this.balance = 0;
    }

    public void chooseAction() {
        System.out.println("Choose your action:");
        System.out.println("1) Add income");
        System.out.println("2) Add purchase");
        System.out.println("3) Show list of purchase");
        System.out.println("4) Balance");
        System.out.println("0) Exit");
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

    public void addPurchase() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter purchase name:");
        String txt1 = sc.nextLine().trim();
        System.out.println("Enter its price:");
        String txt3 = sc.nextLine().trim();
        sb.append(txt1).append(" $").append(txt3);
        System.out.println("Purchase was added!\n");
        purchaseList.add(sb.toString());
        String[] tx = sb.toString().split("\\$");
        balance-=Double.valueOf(tx[1]);

    }

    public void showListOfPurchase() {
        if (purchaseList.size() > 0) {
            purchaseList.forEach(System.out::println);
            System.out.println();
        } else {
            System.out.println("Purchase list is empty\n");
        }
    }

    public boolean processAction() {
        chooseAction();
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println();
                System.out.println("Enter Income: ");
                addIncome(scanner.nextDouble());
                break;
            case 2:
                System.out.println();
                addPurchase();
                break;

            case 3:
                System.out.println();
                showListOfPurchase();
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


}
