import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner entrada= new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        a = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        b = entrada.nextInt();

        if (a > b) {
            System.out.println("a es mayor que b");
        }else if (a==b) {
            System.out.println("a es igual a b");
        }else {
            System.out.println("a es menor que b");
        }
    }
}
