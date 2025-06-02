public abstract class BankAccount {
    protected double balance;
    protected int numDeposits;
    protected int numWithdrawals;
    protected double interestRate;
    protected double monthlyServiceCharge;
    protected double monthlyInterest;
    protected double serviceCharge;

    public BankAccount(double balance, double interestRate, double monthlyServiceCharge) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.monthlyServiceCharge = monthlyServiceCharge;
    }

    public void setMonthlyServiceCharge(double monthlyServiceCharge) {
        this.monthlyServiceCharge = monthlyServiceCharge;
    }

    public double getMonthlyServiceCharge() {
        return monthlyServiceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setNumDeposits(int numDeposits) {
        this.numDeposits = numDeposits;
    }

    public int getNumDeposits() {
        return numDeposits;
    }

    public void setNumWithdrawals(int numWithdrawals) {
        this.numWithdrawals = numWithdrawals;
    }

    public int getNumWithdrawals() {
        return numWithdrawals;
    }

    public int numWithdrawals() {
        return numWithdrawals;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double depositAmount) {
        numDeposits++;
        balance += depositAmount;
    }

    public void withdraw(double withdrawalAmount) {
        numWithdrawals++;
        balance -= withdrawalAmount;
    }

    public void calcInterest() {
        double monthlyInterestRate = interestRate / 12;
        monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
        
    }

    public void monthlyProcess() {

        balance -= serviceCharge;
        calcInterest();
        System.out.println(toString());
        setNumDeposits(0);
        setNumWithdrawals(0);   
    }

    @Override
    public String toString() {
        return String.format("""

                             ***Monthly Account Statement***

                             Annual Interest Rate: %.2f%%
                             Total Interest: $%.2f
                             Monthly Service Charge: $%.2f
                             Number of Deposits: %d
                             Number of Withdrawals: %d
                             Balance: $%.2f

                             *******************************

                             """, (interestRate*100), monthlyInterest, serviceCharge, numDeposits, numWithdrawals, balance
        );
    }

}
