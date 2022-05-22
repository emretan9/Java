package giris;

class Car{
    String type;
    String model;
    String color;
    int speed;
    int speedLimit=180;

    //CONSTRUCTOR METHODS
/*
    In order to avoid typing model,color etc of car u can make constructor

    Car(String model,int speed,String color){
        model=this.model;
        speed=this.speed;
        //this means that model variable of this cunstructor same with model at car class
        color=this.color;
        this.type="sedan";
        this.speedLimit=180;
    }
*/
    void increaseSpeed(int increment){
        if ((speed+increment)<=speedLimit) {
            speed+=increment;
        }
        else if((speed+increment)>speedLimit){
            System.out.println("You reached speed limit so you cannot accelerate");
        }
    }
    void decreaseSpeed(int decrement){
        if(speed > 0) speed-=decrement;
        if(decrement == 0) System.out.println("You cannot decrease your speed");
    }
    void printSpeed(){
        System.out.println("Your speed is "+speed);
    }
    //USAGE OF this.
    void printInfo(){
        System.out.println("Model of car is "+this.model+"\ntype of car is "+this.type+"\nColor of car is "+this.color+"\nSpeed is "+this.speed);
        System.out.println("------------------------------------------------------------------");
    }
}

public class Classes {
    public static void main(String[] args) {
        Car bmw=new Car();//It means that create a new object called bmw at Car() class.
          /*
          ->If you dont add constructor,u need the write like that.
          ->If u add constructor you must write like Car bmw=new Car("E92",...);
          */

          bmw.model="E92";
          bmw.color="white";
          bmw.type="coupe";
          bmw.speed=150;

        Car audi=new Car();
          audi.model="TT";
          audi.color="blue";
          audi.type="coupe";
          audi.speed=100;

        Car mercedes=new Car();
          mercedes.model="G63";
          mercedes.color="black";
          mercedes.type="suv";
          mercedes.speed=120;

        System.out.println("Brand of car is BMW");
          bmw.printInfo();
        System.out.println("Brand of car is AUDI");
          audi.printInfo();
        System.out.println("Brand of car is MERCEDES");
          mercedes.printInfo();

        System.out.println("Increase E92 speed by 20");
        bmw.increaseSpeed(20);
        bmw.printSpeed();
        System.out.println("Decrease E92 speed by 10");
        bmw.decreaseSpeed(10);
        bmw.printSpeed();

    }
}
/* OUTPUT:
Brand of car is BMW
Model of car is E92
type of car is coupe
Color of car is white
Speed is 150
------------------------------------------------------------------
Brand of car is AUDI
Model of car is TT
type of car is coupe
Color of car is blue
Speed is 100
------------------------------------------------------------------
Brand of car is MERCEDES
Model of car is G63
type of car is suv
Color of car is black
Speed is 120
------------------------------------------------------------------
Increase E92 speed by 20
Your speed is 170
Decrease E92 speed by 10
Your speed is 160
*/