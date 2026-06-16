public class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void display() {
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Karunakar", 5000);
        b1.deposit(2000);
        b1.withdraw(3000);
        b1.display();

        BankAccount b2 = new BankAccount("Karuna", 1000);
        b2.withdraw(5000);
        b2.display();
    }
}
