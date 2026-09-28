import java.util.ArrayList;

public class Opg3Transaction {
    String type;
    double amount;

    public Opg3Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return type + ": " + amount + " kr";
    }
}
