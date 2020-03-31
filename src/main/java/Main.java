public class Main {
    public static void main(String[] args) {
        BudgetManager budgetManager = new BudgetManager();
        boolean status;
        do {
            status = budgetManager.processAction();
        }
        while (status == true);
    }
}