public class BankAccount {
    private double balance;


    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public BankAccount() {
    }

    // current balance
    public double getBalance() {
        return this.balance;
    }

    //  deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: ₹" + amount);
            System.out.println("---Balance Amount: ₹" + this.balance + "---");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    //  withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance ) {
            this.balance -= amount;
            if (this.balance < 1000){
                System.out.println("\nWithdrawal failed Balance cannot be less than ₹1000!");
                this.balance += amount;
            }
            else
            System.out.println("Withdrawn: ₹" + amount);
            System.out.println("---Balance Amount: ₹" + this.balance + "---");
            return true;
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            System.out.println("Insufficient balance!");
        }
        return false;
    }
}

