

public class Main {
    public static void main(String[] args) {

            BankAccount account = new BankAccount(2000.0); // Starting with $1000

            ATM atm = new ATM(account);

            atm.showMenu();
        }
    }
