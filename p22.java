import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        Scanner salario = new Scanner(System.in);
        Scanner horas = new Scanner(System.in);
        System.out.println("Escribe le nombre del empleado:");
        String nombre_empleado = nombre.next();
        System.out.println("Escribe el salario básico del empelado como un número entero:");
        int salario_b = salario.nextInt();
        System.out.println("Escribe las horas trabajadas en el mes por el empleado como número entero: ");
        int horas_t = horas.nextInt();
        int salario_m = salario_b * horas_t;
        if (salario_m > 450000) {
            System.out.println(nombre_empleado + ", su salario mensual es de $" + salario_m);
        } else {
            System.out.println(nombre_empleado);
        }

    }
}
