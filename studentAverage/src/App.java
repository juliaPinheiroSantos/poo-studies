import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua média: ");
        double average = scanner.nextDouble();

        if (average >= 9.00){
            System.out.println("Parabéns, você é um excelente aluno.");
        } else if (average >= 8.00){
            System.out.println("Parabéns, sua média ficou próxima da nota máxima.");
        } else if (average > 7.00){
            System.out.println("Parabéns, suas notas ficaram acima da média.");
        } else if (average == 7.00){
            System.out.println("Você foi aprovado.");
        } else {
            System.out.println("Você precisa estudar mais.");
        }

        scanner.close();
    }
}
