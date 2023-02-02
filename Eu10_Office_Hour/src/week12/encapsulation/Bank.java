package week12.encapsulation;

public class Bank {
    BankAccount account1 = new BankAccount();

    public void one(){
        System.out.println(account1.getAccountName());
        account1.setAccountName("John");
    }
}
