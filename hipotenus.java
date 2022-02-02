package giris;
import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;
        double c,u;
        System.out.print("enter a:");
        a =inp.nextInt();
        System.out.print("enter b:");
        b =inp.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("c is "+c);

        u=(a+b+c)/2;
        System.out.println("perimeter is "+2*u);
        System.out.println("area is "+((a*b)/2));






    }
}
