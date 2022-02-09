package giris;
import java.util.Scanner;
public class taxi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double km;
        double perKm=2.20,total;
        System.out.print("Enter a distance in KM:");
        km=inp.nextDouble();
        total= 10+(perKm*km);

        if(total<20){
            total=20;
            System.out.println("Minimum price is 20TL so your new price is:"+total);
        }
        else{
            System.out.println("total price is "+total);
        }

        /*
        total = (total<20) ? 20 : total;
        */


    }
}
