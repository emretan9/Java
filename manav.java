package giris;
import java.util.Scanner;
public class manav {
    static final double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.0;
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double toplam=0,kg=0;
        System.out.println("armut kaç kilo");
        kg=inp.nextDouble();
        double armut_fiyat=kg*armut;
        toplam=toplam+armut_fiyat;

        System.out.println("elma kaç kilo");
        kg=inp.nextDouble();
        double elma_fiyat=kg*elma;
        toplam=toplam+elma_fiyat;
       // System.out.println("toplam para="+toplam);

        System.out.println("domates kaç kilo");
        kg=inp.nextDouble();
        double domates_fiyat=kg*domates;
        toplam=toplam+domates_fiyat;

        System.out.println("muz kaç kilo");
        kg=inp.nextDouble();
        double muz_fiyat=kg*muz;
        toplam=toplam+muz_fiyat;

        System.out.println("patlıcan kaç kilo");
        kg=inp.nextDouble();
        double patlıcan_fiyat=kg*patlıcan;
        toplam=toplam+patlıcan_fiyat;

        System.out.println("Toplam tutar "+toplam+"TL");

    }
}
