package giris;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double height,weight,Index;

        System.out.print("Enter your height in meter: ");
        height=inp.nextDouble();
        System.out.print("Enter your weight : ");
        weight=inp.nextDouble();

        Index= (weight/(height*height));
        System.out.print("your body mass index is "+Index);

    }
}
