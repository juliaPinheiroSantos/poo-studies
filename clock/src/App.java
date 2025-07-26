import java.util.Scanner;
import model.entitis.Clock;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        Clock clock = new Clock(hour, minute, second);

        System.out.println(clock.setClock(hour, minute, second));

    }
}
