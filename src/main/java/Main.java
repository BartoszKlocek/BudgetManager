public class Main {
    public static void main(String[] args) {
        BudgetManager budgetManager = new BudgetManager();
        boolean status;
        do {
            status = budgetManager.processAction();
        }
        while (status == true);

    }

    //        Scanner sc = new Scanner(System.in);
//        StringBuilder stringBuilder = new StringBuilder();
//        double count = 0;
//        while (sc.hasNext()) {
//            String txt = sc.nextLine();
//            stringBuilder.append(txt + "\n");
//            count += Double.valueOf(txt.split("\\$")[1]);
//        }
//        System.out.println();
//        System.out.println(stringBuilder.toString());
//        System.out.println("Total: $" + count);
//    }


}