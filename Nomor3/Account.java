package Nomor3;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this(id, name, 0.0);
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    public void debit(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Amount exceeded balance.");
            }
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    public void transferTo(Account anotherAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                anotherAccount.credit(amount);
            } else {
                System.out.println("Amount exceeded balance.");
            }
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    @Override
    public String toString() {
        return String.format("Account[id=%s, name=%s, balance=%.2f]", id, name, balance);
    }
}