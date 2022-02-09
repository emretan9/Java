package giris;
import java.util.Scanner;

public class AreaCircCircle {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int r,a;
        double pi=3.14,area,circumference,area2;

        System.out.print("enter a radius");
        r=inp.nextInt();
        circumference=2*pi*r;
        area=pi*(r*r);
        System.out.print("circumference of circle is "+circumference);
        System.out.print("\narea of circle is "+area);

        System.out.println("\nenter a angle of quarter circle");
        a=inp.nextInt();
        area2=(pi*(r*r)*a)/360;
        System.out.println("area of quarter circle is "+area2);

    }

}
