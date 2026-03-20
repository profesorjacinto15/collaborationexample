import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el valor");
        int valor = tec.nextInt();
        System.out.println("La Tabla de Multiplicar del "+valor);
        for(int i=1; i<=10;i++) {
            System.out.println(i+" * "+valor+" = "+i*valor);
        }
        tec.close();
    }
}