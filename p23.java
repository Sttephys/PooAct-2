import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        double A = a.nextDouble();
        System.out.println("Ingrese el valor de B:");
        double B = b.nextDouble();
        System.out.println("Ingrese el valor de C:");
        double C = c.nextDouble();
        double discriminante = Math.pow(B, 2.0) - 4.0 * A * C;
        if (discriminante < 0.0) {
            System.out.println("El discrimiannte al ser negativo (" + discriminante + "), hará que el sistema tenga soluciones complejas.");
            System.out.println("Y esta es: x = (-" + B + "±√" + Math.abs(Math.pow(B, 2.0) - 4.0 * A * C) + "i)/" + 2.0 * A);
        } else {
            double x1;
            if (discriminante == 0.0) {
                System.out.println("El sistema tiene una única solución real.");
                x1 = (-B + Math.sqrt(Math.pow(B, 2.0) - 4.0 * A * C)) / (2.0 * A);
                System.out.println("Y esta es: x = " + x1);
            } else {
                System.out.println("El sistema tiene dos soluciones reales diferentes.");
                x1 = (-B + Math.sqrt(Math.pow(B, 2.0) - 4.0 * A * C)) / (2.0 * A);
                double x2 = (-B - Math.sqrt(Math.pow(B, 2.0) - 4.0 * A * C)) / (2.0 * A);
                System.out.println("Y estas son: x1 = " + x1 + ", y x2 = " + x2);
            }
        }

    }
}
