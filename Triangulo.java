import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        float lado1;
        float lado2;
        float lado3;
        float perimetro;
        double semi;
        double area;

        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese el primer lado del triangulo: ");
        lado1 = entrada.nextFloat();

        System.out.println("Ingrese el segundo lado del triangulo: ");
        lado2 = entrada.nextFloat();

        System.out.println("Ingrese el tercer lado del triangulo: ");
        lado3 = entrada.nextFloat();

        perimetro = lado1+lado2+lado3;
        semi = perimetro/2;
        area = Math.sqrt(semi*( (semi-lado1)*(semi-lado2)*(semi-lado3) ) );

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El semiperimetro es: " + String.format("%.2f",semi) );
        System.out.println("El area es: " + String.format("%.2f",area) );
    }
}
