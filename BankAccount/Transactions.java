public class Transactions {
    public static void main(String[] args) {
        SavingsAccount trans1 = new SavingsAccount(10, .0035, 5.00);

        trans1.deposit(100);
        trans1.withdraw(15);
        trans1.withdraw(20);
        trans1.withdraw(10);
        trans1.withdraw(5);
        trans1.withdraw(25);
        trans1.withdraw(15);
        trans1.withdraw(10);

        trans1.monthlyProcess();

        trans1.deposit(1000);

        trans1.monthlyProcess();
    }
}
