import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("Se tienen 3 esferas de DIFERENTE PESO.");
        System.out.println("Escribe el peso de la esfera A:");
        float A = a.nextFloat();
        System.out.println("Escribe el peso de la esfera B:");
        float B = b.nextFloat();
        System.out.println("Escribe el peso de la esfera C:");
        float C = c.nextFloat();
        if (A > B && A > C) {
            System.out.println("La esfera de mayor peso es A y pesa " + A + " kg");
        } else if (B > A && B > C) {
            System.out.println("La esfera de mayor peso es B y pesa " + B + " kg");
        } else {
            System.out.println("La esfera de mayor peso es C y pesa " + C + " kg");
        }

    }
}
