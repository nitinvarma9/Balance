public class MonthlyBalance {

    public static void main(String[] args) {
        double balance = 4500;
        double interest = balance * 0.17;
        System.out.printf("The interest after 1 month is $%.2f\n", interest);
        balance += interest;
        System.out.printf("The interest after 2 months is $%.2f\n", interest+balance*0.17);
    }

}