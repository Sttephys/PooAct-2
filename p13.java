import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Buy,Pay, Discount;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        Buy = scan.nextInt();
        System.out.println("Ingrese el color de la bolita: ");
        String Color = scan.next();
        Color = Color.toUpperCase();

        switch (Color) {
            case "BLANCO":
                Discount = 0;
                break;
             case "VERDE":
                Discount = 10;
                break;
              case "AMARILLO":
                Discount = 25;
                break;
               case "AZUL":
                Discount = 50;
                break;
            default:
                Discount = 100;
                break;
        }
        Pay=Buy-Discount*Buy/100;
        System.out.println("El cliente debe pagar: $"+Pay);
    }
}