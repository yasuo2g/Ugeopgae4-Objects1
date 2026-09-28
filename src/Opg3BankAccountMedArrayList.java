import java.util.ArrayList;

public class Opg3BankAccountMedArrayList {
    String owner;
    double balance;
    ArrayList<Opg3Transaction> transactions;

    public Opg3BankAccountMedArrayList(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
        // Tilføj start balance som transaction
        transactions.add(new Opg3Transaction("deposit", startBalance));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            transactions.add(new Opg3Transaction("deposit", amount));
            System.out.println("Indsatte " + amount + " kr");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            transactions.add(new Opg3Transaction("withdrawal", amount));
            System.out.println("Hævede " + amount + " kr");
        } else if (amount > balance) {
            System.out.println("Ikke nok penge på kontoen");
        }
    }

    public void printTransactionHistory() {
        System.out.println("\n=== Transaktionshistorik for " + owner + " ===");
        for (Opg3Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public double getBalance() {
        return balance;
    }

    public Opg3Transaction getLargestTransaction() {
        if (transactions.size() == 0) {
            return null;
        }

        Opg3Transaction largest = transactions.get(0);
        for (Opg3Transaction t : transactions) {
            if (t.amount > largest.amount) {
                largest = t;
            }
        }
        return largest;
    }
}
