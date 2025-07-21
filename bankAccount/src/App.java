import model.entitis.Account;
import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(2200.00, "Julia");
        System.out.println("Informe um valor de saque: ");
        Double value = scanner.nextDouble();
        account.decreaseBalance(value);
        System.out.println("O valor do seu saldo é R$" + account.getBalance());
        scanner.close();
    }
}
