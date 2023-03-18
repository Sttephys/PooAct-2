import java.util.Scanner;
public class p14 {
    public static void main(String[] args) {
        double Sales1,Sales2,Sales3, Salary, TotalSales,Spercent;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ventas del departamento 1: ");
        Sales1 = scan.nextDouble();
        System.out.println("Ventas del departamento 2: ");
        Sales2 = scan.nextDouble();
        System.out.println("Ventas del departamento 3: ");
        Sales3 = scan.nextDouble();
        System.out.println("Salario de los vendedores: ");
        Salary = scan.nextDouble();

        double Salary1,Salary2, Salary3;

        TotalSales = Sales1+Sales2+Sales3;
        Spercent = 0.33*TotalSales;
        if(Sales1>Spercent){
            Salary1 = Salary+0.2*Salary;
    } else{
            Salary1=Salary;
        }
        if (Sales2>Spercent){
            Salary2=Salary+0.2*Salary;
        } else{
            Salary2=Salary;
        }
        if (Sales3>Spercent){
            Salary3 = Salary+0.2*Salary;
        }else{
            Salary3 =Salary;
        }
        System.out.println("Salario vendedores depto. 1: "+Salary1+"\n"+"Salario vendedores depto. 2: "+Salary2+"\n"+"Salario vendedores depto. 3: "+Salary3);


    }
    }