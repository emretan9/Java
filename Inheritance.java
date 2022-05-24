package giris;
class Calisan{
    private String adSoyad;
    private String telefon;
    private String eposta;
    //Calisan is superClass
    //constructor
    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    //Getter and setter methods
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    //methods
    public void giris(){
        System.out.println(this.adSoyad+" Universiteye giris yaptı!");
    }
    public void cikis(){
        System.out.println(this.adSoyad+" Universiteden cikis yaptı!");
    }
    public void yemekhane(){
        System.out.println(this.adSoyad+" Yemekhaneye girdi!");
    }
}
    //SUBCLASS AKADEMİSYEN

class Akademisyen extends Calisan{
     private String bolum;
     private String unvan;
    //If subclass extends the main class,this is obligation that must call constructor of main class(Calisan)
    //if constuctor use super() it means that this constructor get reference from main class
        public Akademisyen(String adSoyad,String telefon,String eposta,String bolum,String unvan){
            super(adSoyad, telefon, eposta);//Firstly use super unless u got error
            this.bolum=bolum;
            this.unvan=unvan;
        }

    public String getBolum() {
        return this.bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return this.unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    //methods
    public void derseGir(){
        System.out.println(this.getAdSoyad()+" Derse giriş yapt!");
    }
}
class Memur extends Calisan{
    private String departman;
    private String mesai;

    //constructor
    public Memur(String adSoyad, String telefon, String eposta, String departman, String mesai) {
        super(adSoyad, telefon, eposta);
        this.departman = departman;
        this.mesai = mesai;
    }

    //getter and setter
    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }
    //methods
    public void calis(){
        System.out.println(this.getAdSoyad()+" memur calismaya basladi!");
    }
}
class OgretimGorevlisi extends Akademisyen{
    //Calısan is the general class and we divided it to 2 part which are akademisyen and memur.
    //OgretimGorevlisi is subclass of akademisyen so when we create class with this name we extend it with upper level class akademsiyen
    //It will get bolum and unvan same with akademisyen

    private String kapiNo;
    //As we mentioned before it must get the upper level class constructor
    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan,String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo=kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Calisan c1=new Calisan("emre tanrıkulu","05065065063","info@emre.com");
        Akademisyen a1=new Akademisyen("Engin kandıran","05350222222","info@engin.com","IT","docent");
        System.out.println(a1.getBolum());
        a1.derseGir();
        //U can create a memur object in calısan class but u cant reach methods of memur
        //Calisan m1=new Memur("kevin durant","05366547896","info@kd.com","Security","09.00");
        Memur m1=new Memur("kevin durant","05366547896","info@kd.com","Security","09.00");

        OgretimGorevlisi o1=new OgretimGorevlisi("Kyrie Irving","05321231212","info@kai.com","MIS","senior","100");
        o1.giris();//giris() is not in the OgretimGorevlisi class but it came from the inheritance of akademisyen. OgretimGorevlisi is the subclass of akademisyen
    }
}
/* OUTPUT:
IT
Engin kandıran Derse giriş yapt!
Kyrie Irving Universiteye giris yaptı!

*/
