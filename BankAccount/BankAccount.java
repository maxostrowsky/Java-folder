public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalBalance = 0;

    public BankAccount(){
        setCheckingBalance(0);
        setSavingsBalance(0);
        this.numberOfAccounts++;
        this.totalBalance = getCheckingBalance() + getSavingsBalance();
    }


    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void setCheckingBalance(double amount){
        this.checkingBalance = amount;
        this.totalBalance += amount;
    }

    public void setSavingsBalance(double amount){
        this.savingsBalance = amount;
        this.totalBalance += amount;
    }

    public void depositMoney(String account, double amount){
        if(account == "Checking"){
            setCheckingBalance(getCheckingBalance() + amount);
        } else if(account == "Savings"){
            setSavingsBalance(getSavingsBalance() + amount);
        } else {
            System.out.println("Invalid Account.");
        }
    }

    public void withdrawalMoney(String account, double amount){
        if(account == "Checking"){
            if (amount > this.checkingBalance){
                System.out.println("Not Enough Funds.");
            } else {
                setCheckingBalance(getCheckingBalance() - amount);
            }
        } else if(account == "Savings"){
            if (amount > this.savingsBalance){
                System.out.println("Not Enough Funds.");
            } else {
                setSavingsBalance(getSavingsBalance() - amount);
            }
        } else {
            System.out.println("Invalid Account.");
        }
    }

    public double displayBalance(){
        return getSavingsBalance() + getCheckingBalance();
    }
}