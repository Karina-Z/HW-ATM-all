package Homework4.Task2;

public class Main {
    public static void main(String[] args) {

        Account depositAccount = new Account();
        depositAccount.setCreditFlag(false);
        depositAccount.setBalance(300);
        depositAccount.addMoney(100);
        depositAccount.withdrawMoney(300);
        System.out.println("Your balance is " + depositAccount.getBalance());

        Account creditAccount = new Account();
        creditAccount.setCreditFlag(true);
        creditAccount.setBalance(100);
        creditAccount.addMoney(100);
        creditAccount.withdrawMoney(300);
        System.out.println("Your balance is " + creditAccount.getBalance());
    }
}
