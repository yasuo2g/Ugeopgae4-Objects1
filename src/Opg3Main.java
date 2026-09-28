import java.util.ArrayList;

public class Opg3Main {
    public static void main(String[] args) {
        Opg3BankAccountMedArrayList account = new Opg3BankAccountMedArrayList("Anna", 1000);

        account.deposit(500);
        account.withdraw(200);
        account.deposit(1000);
        account.withdraw(300);
        account.withdraw(5000);  // Fejler

        account.printTransactionHistory();

        System.out.println("\nNuværende saldo: " + account.getBalance() + " kr");

        // Ekstra udfordring
        Opg3Transaction largest = account.getLargestTransaction();
        System.out.println("\nStørste transaktion: " + largest);
    }
}
