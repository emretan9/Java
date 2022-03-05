package giris;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double num1,num2;
        int select;

        System.out.print("Enter first number");
        num1=inp.nextDouble();

        System.out.print("Enter second number");
        num2=inp.nextDouble();

        System.out.println("Select your calculation:");
        System.out.println("\t1-)SUMMATION");
        System.out.println("\t2-)SUBSTRACTION");
        System.out.println("\t3-)DIVISION");
        System.out.println("\t4-)MULTIPLICATION");
        select= inp.nextInt();

        switch (select){
            case 1:
                System.out.println("you select summation");
                break;
            case 2:
                System.out.println("you select substraction");
                break;
            case 3:
                System.out.println("you select division");
                break;
            case 4:
                System.out.println("you select multiplicaton");
                break;
            default :
                System.out.println("Invalid selection");
        }

        switch (select){
            case 1:
                System.out.println("Process result is "+(num1+num2));
                break;
            case 2:
                if(num1>num2)System.out.println("Process result is "+(num1-num2));
                else if(num2>num1)System.out.println("Process result is "+(num2-num1));
                break;
            case 3:
                if(num1 == 0 || num2 == 0) System.out.println("WARNING!!You cannot divide number to zero");
                else {
                    if(num1>num2)System.out.println("Process result is "+(num1/num2));
                    else if(num2>num1)System.out.println("Process result is "+(num2/num1));
                }
                break;
            case 4:
                System.out.println("Process result is "+(num1*num2));
                break;
            default:
                System.out.println("Try again!!");
        }
    }
}
