package giris;
import java.util.Scanner;

public class Methods {
    public static void greeting(String name){
        //greeting is name of method
        //VOID means that method doesn't have a return value
        //STATIC means that the method belongs to the Main class and not an object of the Main class
        System.out.println("Hi! what's up "+name+"\nThis is test of methods");
    }

    public static void factorial(){
        Scanner inp=new Scanner(System.in);
        int num1,factorial_result=1;
        System.out.print("Enter a number to see factorial:");
        num1= inp.nextInt();
        for(int i=1;i<=num1;i++){
            factorial_result*=i;
        }
        System.out.println("Result of factorial that you want to see is "+factorial_result);
    }
    //USAGE OF RETURN:
       static int power(int base,int exp){
         int result=1;
         for(int i=1;i<=exp;i++){
             result *=base;
              }
         return result;//at this type of method you need the return something
           //If you use public static int you need to return something and you must use sout to see method
           //At void method u was already using the sout at body of method.
          }
    //OVERLOADING :
    public static void summation(String a,String b){
        System.out.println("String summation equals to "+ a+" "+b);
    }
    public static void summation(int a,int b){
        System.out.println("Summation equals to "+ (a+b));//In order to enter 2 integer
    }

    public static void summation(int a,int b,int c){
        System.out.println("Summation equals to "+ (a+b+c));
        //When u entered just a and b,it will cause error.In order to overcome that problem you need to redeclare method.
        //this is called overloading
    }
    public static void main(String[] args) {
         greeting("emre");//calling void method with parameter called "name"
        power(5,2);//this is the way of calling method ith giving parameters
        System.out.println("First way:"+power(5,2));
        int case1=power(5,3);//2.way
           System.out.println("Second way is 5^3="+case1);

        factorial();
        System.out.println("-----------------\n OVERLOADING OUTPUTS:");
        summation("emre","tanrıkulu");
        summation(1,2,3);
        summation(5,9);
    }

}
