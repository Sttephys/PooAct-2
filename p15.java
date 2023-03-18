import java.util.Scanner;
public class p15 {
    public static void main(String[] args) {
        int sphereA, sphereB, sphereC, sphereD;

        Scanner scan = new Scanner(System.in);
        System.out.println("Peso de la esfera A:");
        sphereA = scan.nextInt();
        System.out.println("Peso de la esfera B:");
        sphereB = scan.nextInt();
        System.out.println("Peso de la esfera C:");
        sphereC = scan.nextInt();
        System.out.println("Peso de la esfera D:");
        sphereD = scan.nextInt();

        if ((sphereA == sphereB) && (sphereA == sphereC)) {
            System.out.println("La esfera D es la diferente");
            if (sphereD > sphereA) {
                System.out.println(" y es de mayor peso");
            } else {
                System.out.println(" y es de menor peso");
            }
        } else if ((sphereA == sphereB) && (sphereA == sphereD)) {
            System.out.println("La esfera C es la diferente");
            if(sphereC>sphereA){
                System.out.println(" y es de mayor peso");
            } else {
                System.out.println(" y es de menor peso");
            }

        } else if ((sphereA==sphereC) && (sphereA == sphereD)) {
            System.out.println("La esfera B es la diferente");
            if(sphereB>sphereD) {
                System.out.println(" y es de mayor peso");
            }else {
                System.out.println(" y es de menor peso");
            }
        }else {
            System.out.println("La esfera A es la diferente");
            if(sphereA>sphereB) {
                System.out.println(" y es de mayor peso");
            }else {
                System.out.println(" y es de menor peso");
            }
        }

    }
}