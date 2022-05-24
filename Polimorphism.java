package giris;
class Animal{
    private String isim;

    //constructor
    public Animal(String isim) {
        this.isim = isim;
    }

    //getter an setter
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    //method
    public String speak(){
        return "Animal is speaking";
    }
}

class Cat extends Animal{
    public Cat(String isim) {
        super(isim);
    }

    @Override
    //The ability of a subclass to override a method allows a class to inherit from a superclass whose behavior is "close enough" and then to modify behavior as needed.
    // The overriding method has the same name, number and type of parameters, and return type as the method that it overrides.
    public String speak() {
        return this.getIsim()+" meow";
    }
}

class Dog extends Animal{
    public Dog(String isim) {
        super(isim);
    }

    @Override
    public String speak() {
        return this.getIsim()+" bark";
    }
}

class Horse extends Animal{
    public Horse(String isim) {
        super(isim);
    }

    @Override
    public String speak() {
        return this.getIsim()+" kisniyor";
    }
}

public class Polimorphism {
    //Different method class
    public static void letItSpeak(Animal animal){
        System.out.println(animal.speak());
    }
    public static void main(String[] args) {
    Animal myCat=new Cat("tekir");
    Animal myDog=new Dog("lessie");
    Animal myHorse=new Horse("Şehsuvar");
       System.out.println(myCat.speak());
       System.out.println(myDog.speak());
       System.out.println(myHorse.speak());
    System.out.println("-------------------------------------");
    System.out.println("Secnd type:");//When we call that method,it automatically get Animal reference because we use it as parameter at letItSpeak() method.
    letItSpeak(new Cat("carlos"));
    letItSpeak(new Dog("Chop"));
    letItSpeak(new Horse("şahbatur"));

    /*
    Polymorphism means many forms.
    It give ability of an object to identify as more than one type
    We create cat from Cat subclass with Animal superclass.
    */
    }
}
/* OUTPUT:
tekir meow
lessie bark
Şehsuvar kisniyor
-------------------------------------
Secnd type:
carlos meow
Chop bark
şahbatur kisniyor
*/

