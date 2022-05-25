package giris;

abstract class sekil{
    private String name;

    //constructor
    public sekil(String name) {
        this.name = name;
    }
    //methods
    public void telName(){
        System.out.println("This object is "+name+" object");
    }
    //abstract method
    abstract void areaCalculation();//This is abstract method that does not contain body part.
    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 class kare extends sekil{
    private int edge;

    //constructor
    public kare(String name,int edge) {
        super(name);
        this.edge=edge;
    }
    // abstract method overrided and modified it
    @Override
    void areaCalculation() {
        System.out.println("Area of "+ getClass()+":"+(edge*edge));
    }
    //method
    public void perimeterCalculation(){
        System.out.println("Perimeter of "+getName()+" :"+(edge*4));
    }

}
 class daire extends sekil{
    private int radius;
     //constructor
    public daire(String name, int radius) {
        super(name);
        this.radius = radius;
    }

     // abstract method overrided and modified it
    @Override
    void areaCalculation() {
        System.out.println("Area of "+ getClass()+" :"+(Math.PI*(radius*radius)));
    }
}

public class Abstraction {
    public static void main(String[] args) {
        //we cannot create object with abstract class
        kare kare=new kare("kare1",5);
        daire daire=new daire("daire1",3);

        kare.perimeterCalculation();
        kare.areaCalculation();
        daire.areaCalculation();
        System.out.println("--------------------------------");
        sekil sekil;
        sekil=new kare("kare2",6 );
        sekil.areaCalculation();

        /*
        Data abstraction is the process of hiding certain details and showing only essential information to the user.
        Abstraction can be achieved with either abstract classes or interfaces

        The abstract keyword is a non-access modifier, used for classes and methods:

         *Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

         *Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
        */
    }
}

/* OUTPUT:
Perimeter of kare1 :20
Area of class giris.kare:25
Area of class giris.daire :28.274333882308138
--------------------------------
Area of class giris.kare:36
*/
