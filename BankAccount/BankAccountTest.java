public class BankAccountTest{
    public static void main(String[] args){


        BankAccount account1 = new BankAccount();
        

        account1.withdrawalMoney("Checking", 10);
        System.out.println(account1.getCheckingBalance());
        account1.depositMoney("Checking", 10);
        System.out.println(account1.getCheckingBalance());
        account1.depositMoney("Savings", 150);
        System.out.println(account1.getSavingsBalance());
        System.out.println(account1.displayBalance());
        
    }
}