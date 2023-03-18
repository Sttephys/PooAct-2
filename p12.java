import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajor:");
        String Name = scan.next();
        System.out.println("Ingrese el número de horas trabajadas:");
        int HoursWorked = scan.nextInt();
        System.out.println("Ingrese el valor de la hora normal trabajada:");
        int NormalHour = scan.nextInt();
        int ExtraHour, ExtraHour8,Salary;

        if(HoursWorked>40) {
            ExtraHour=HoursWorked-40;
            if(ExtraHour>8) {
                ExtraHour8 = ExtraHour-8;
                Salary=40*NormalHour+16*NormalHour+ExtraHour8*3*NormalHour;
            }
            else{
                Salary=40*NormalHour+ExtraHour*2*NormalHour;
            }
        }
        else{
            Salary= HoursWorked*NormalHour;
        }
        System.out.println("El trabajador "+Name+" devengó: $"+Salary);
    }
}