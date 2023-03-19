import java.util.Scanner;
public class Matricula {
    public static void main(String[] args) {
        String ni;
        String nom;
        int pat;
        int est;
        double pagmat;

        Scanner entrada= new Scanner(System.in);

        System.out.print("Ingrese el numero de inscripcion: ");
        ni = entrada.next();

        System.out.print("Ingrese nombres: ");
        nom = entrada.next();

        System.out.print("Ingrese el patrimonio: ");
        pat = entrada.nextInt();

        System.out.print("Ingrese el estrato: ");
        est = entrada.nextInt();

        pagmat=50000;

        if ((pat>2000000) && (est>3)) {
            pagmat = pagmat+0.03*pat;
        }else {
            pagmat=pagmat;
        }
        System.out.println("es estudiante con numero de inscripcion "+ni+" y nombre "+nom);
        System.out.println("debe pagar $"+pagmat);
    }
}
