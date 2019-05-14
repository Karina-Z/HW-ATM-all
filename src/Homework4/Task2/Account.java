package Homework4.Task2;

public class Account extends BankAccount {
    double balance;
    boolean creditFlag;
    double fee;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditFlag(boolean creditFlag) {
        this.creditFlag = creditFlag;
    }

    @Override
    public void addMoney(double amount) {

        balance = balance + amount;

    }

    @Override
    public void withdrawMoney(double amount) {
        if (creditFlag || balance >= (amount * 1.01)) {
            balance = balance - amount - calculateFee(amount);
            System.out.println("You get " + amount + " dollars. Your fee is " + calculateFee(amount));
        } else {
            System.out.println("You cannot withdraw this amount. Please enter the amount not more than " + balance);

        }
    }

    @Override
    public double calculateFee(double amount) {
        if (balance >= (amount * 1.01)) {
            fee = amount * 0.01;
        } else {
            fee = (balance*0.01) + ((amount-balance) * 0.05);
        }
        return fee;

    }
}