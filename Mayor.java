import java.util.Scanner;
public class Mayor {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        Scanner entrada= new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        n1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        n2 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        n3 = entrada.nextInt();

        if (n1 > n2 && n1>n3) {
            System.out.println("n1 es el mayor");
        }else if (n2>n3) {
            System.out.println("n2 es el mayor");
        }else {
            System.out.println("n3 es el mayor");
        }
    }
}
