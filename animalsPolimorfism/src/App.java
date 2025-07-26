import model.entitis.Animal;
import model.entitis.Dog;
import model.entitis.Monkey;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Dog("Davi", 3, 50.00, true, ""); //polimorfismo de coleção - um dog é definido como animal
        Animal animal2 = new Monkey("Lucas", 1, 5.00, true, ""); //polimorfismo de coleção - um macaco é definido como animal
        System.out.println(animal1);
        System.out.println(animal2);
        String x = JOptionPane.showInputDialog("Digite");
        int inteirox = Integer.parseInt(x);

        String y = JOptionPane.showInputDialog("Digite");
        int inteiroy = Integer.parseInt(y);

        JOptionPane.showMessageDialog(null, App.soma(inteirox, inteiroy));
        

    }
    //polimorfismo de sobrecarga - métodos com mesmo nome, mas com parâmetros e retornos diferentes.
    public static int soma(int x, int y){
        return x + y;
    }

    public static int soma(int x, int y, int w){
        return x+y+w;
    }

    public static double soma(double x, double y){
        return x + y;
    }

    public static double soma(double x, double y, double w){
        return x + y + w;
    }




}
