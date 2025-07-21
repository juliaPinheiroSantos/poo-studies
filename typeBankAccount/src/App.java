import model.entitis.CheckingAccount;
import model.entitis.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        CheckingAccount account1 = new CheckingAccount(2000.00, "Julia", "2145744544", true);
        SavingsAccount account2 = new SavingsAccount(1000.00,"Davi", "1564865", 10);
        System.out.println(account1);
        System.out.println();
        System.out.println(account2);
    }
}
