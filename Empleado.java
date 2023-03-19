import java.util.Scanner;
public class Empleado {
    public static void main(String[] args) {
        String codigo_empleado;
        String nombre;
        int horas_mes;
        float valor_hora;
        float retencion;

        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese el codigo del empleado: ");
        codigo_empleado = entrada.next();

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();

        System.out.println("Ingrese # de horas trabajadas al mes: ");
        horas_mes = entrada.nextInt();

        System.out.println("Ingrese valor hora trabajada: ");
        valor_hora = entrada.nextFloat();

        System.out.println("Ingrese % de retencion en la fuente: ");
        retencion = entrada.nextFloat();

        float salario_bruto = horas_mes * valor_hora;
        float salario_neto = salario_bruto - (salario_bruto* (retencion/100));

        System.out.println("El codigo del empleado es: " + codigo_empleado);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El salario bruto es: " + salario_bruto);
        System.out.println("El salario neto es: " + salario_neto);

    }
}
