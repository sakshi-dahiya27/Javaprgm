class Account {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

class Customer extends Thread {
    Account account;

    Customer(Account account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(500);
        account.deposit(200);
    }
}

public class Experiment5 {
    public static void main(String[] args) {
        Account acc = new Account();
        Customer c1 = new Customer(acc);
        Customer c2 = new Customer(acc);
        c1.start();
        c2.start();
    }
}