import java.util.Scanner;
public class Equilatero {
    public static void main(String[] args) {
        float lado;
        double altura;
        float perimetro;
        double area;

        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese el valor del lado de triangulo: ");
        lado = entrada.nextFloat();

        perimetro = lado*3;
        altura = Math.sqrt( (lado*lado)-( (lado/2)*(lado/2) ) );
        area = (lado*altura)/2;

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("La altura es: " + String.format("%.2f",altura) );
        System.out.println("El area es: " + String.format("%.2f",area));
    }
}
