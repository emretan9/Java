package giris;
import java.util.Scanner;

//INTERFACE
interface IBank {
    //You cannot declare variable in interface but u can declare variables that we cant change it
    final String hostIpAdress = "127.0.0.1";

    boolean connect(String ipAdress);

    boolean payment(double price, String cardNumber, String expiringDate, String cvc);

    void printInfo(double price, String cardNumber);
}
 class Abank implements IBank{
     //use implements and interface name to use interface that we coded
    private String bankaAdi;
    private String terminalID;
    private String password;

    //constructor

    public Abank(String bankaAdi, String terminal_id, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }
    //methods
    public boolean connect(String ipAdress){
        //Dont forget to add String ipAdress because we used this method in interface.That is obligation dont forget it
        //Returning type should be same with interface
        System.out.println("Kullancı IP:"+ipAdress+"\nMakine IP'si:"+this.hostIpAdress+"\n"+this.bankaAdi+" baglanildi!");
        return true;
    }
    public boolean payment(double price,String cardNumber,String expiringDate,String cvc){
        System.out.println("Islem basarili!");
        return true;
    }

     public void printInfo(double price, String cardNumber){
        System.out.println(price+"TL "+cardNumber+" Numarali hesaba gonderildi ");
    }


    //Getter and setter
    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalID;
    }

    public void setTerminalId(String terminalId) {
        this.terminalID = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
class BBank implements IBank{
    private String bankaAdi;
    private String terminalID;
    private String password;
     //constructor
    public BBank(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }
    //getter and setter
    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }
    public String getTerminalID() {
        return terminalID;
    }
    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //methods
    public boolean connect(String ipAdress){
        System.out.println("Kullancı IP:"+ipAdress+"\nMakine IP'si:"+this.hostIpAdress+"\n"+this.bankaAdi+" baglanildi!");
        return true;
    }
    public boolean payment(double price,String cardNumber,String expiringDate,String cvc){
        System.out.println("Islem basarili!");
        return true;
    }
    public void printInfo(double price, String cardNumber){
        System.out.println(price+"TL "+cardNumber+" Numarali hesaba gonderildi ");
    }
 }

public class Interface {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Tutar giriniz : ");
        double price=inp.nextDouble();
        System.out.println("Kart numarası giriniz : ");
        String cardNumber=inp.next();
        System.out.println("Son kullanım tarihi giriniz : ");
        String expiringDate=inp.next();
        System.out.println("3 Haneli kodu giriniz : ");
        String cvc=inp.next();

        System.out.println("1) A Bankasi");
        System.out.println("2) B Bankasi");
        System.out.println("3) C Bankasi");
        System.out.println("Banka seciniz");
        int select_bank= inp.nextInt();
        switch (select_bank){
            case 1:
                Abank apos=new Abank("A bank","123132321","123654");
                apos.connect("127.1.1.1");
                apos.payment(price,cardNumber,expiringDate,cvc);
                apos.printInfo(price,cardNumber);
                break;
            case 2:
                BBank bpos=new BBank("B bank","985651656","963852");
                bpos.connect("127.1.1.2");
                bpos.payment(price,cardNumber,expiringDate,cvc);
                bpos.printInfo(price,cardNumber);
                /*
                Interface is a template that can be applied to class with related methods with empty bodies.
                Similar to inheritance but main difference is specify class what must do
                use implement to show its interface
                */

        }
    }
}
/* OUTPUT:
 Tutar giriniz :
1000,853
Kart numarası giriniz :
123123123
Son kullanım tarihi giriniz :
12/45
3 Haneli kodu giriniz :
321
1) A Bankasi
2) B Bankasi
3) C Bankasi
Banka seciniz
1
Kullancı IP:127.1.1.1
Makine IP'si:127.0.0.1
A bank baglanildi!
Islem basarili!
1000.853TL123123123 Numarali hesaba gonderildi
*/
