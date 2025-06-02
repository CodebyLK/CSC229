public class SavingsAccount extends BankAccount {
    
    public SavingsAccount(double balance, double interestRate, double monthlyServiceCharge) {
        super(balance, interestRate, monthlyServiceCharge);
    }

    public boolean getStatus() {
        return (balance >= 25.00);
    }

    @Override
    public void withdraw(double withdrawalAmount) {

        if(!getStatus()) {
            System.out.println("Account inactive. Please make a deposit.");
            return;
        }
        if (balance - withdrawalAmount < 25.00) {
            System.out.println("Withdrawal would make account inactive. Transaction denied.");
            return;
        }

        super.withdraw(withdrawalAmount);
        System.out.println("Withdrawal successful.");


    }

   @Override
    public void deposit(double depositAmount) {
        boolean wasInactive = !getStatus();

        super.deposit(depositAmount);

        if(wasInactive && getStatus()) {
            System.out.println("Deposit sucessful.\nYour account is now active.");
        }

        else if (!getStatus()) {
            System.out.println("Your account is now inactive. Please add funds");
        }
    
        else  {
            System.out.println("Deposit sucessful.");
        }

    }

    @Override
    public void monthlyProcess() {
        setServiceCharge(getMonthlyServiceCharge());
        if(getNumWithdrawals() > 4) {
            serviceCharge += (getNumWithdrawals() - 4);
        }

        super.monthlyProcess();

        if(balance < 25.00) {
            System.out.println("Account inactive due to low balance.");
        }
    }
    
}
