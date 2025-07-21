public class App {
    public static void main(String[] args) throws Exception {
        int cont = 0;
        for (int i = 500; i >= 250; i-=2){
            System.out.println(i);
            cont +=i;
        }

        System.out.println("A soma dos números pares de 500 a 250 é: " + cont);
    }
}
