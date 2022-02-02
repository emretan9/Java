package giris;
import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double ucret,kdvUcret,kdvDahil,kdvOran;
        Scanner inp= new Scanner(System.in);

        System.out.print("ücreti giriniz:");
        ucret = inp.nextDouble();

        if(ucret>0 && ucret<1000){
             kdvOran=0.18;
        }
        else{
            kdvOran=0.08;

        }
        kdvUcret= ucret * kdvOran;
        kdvDahil=ucret+kdvUcret;
        System.out.println("ücretin kdvsiz hali:"+ucret);
        System.out.println("ücretin kdv dahil hali:"+kdvDahil);
        System.out.print("kdv tutarı:"+kdvUcret);
    }
}
