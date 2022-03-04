package ACM321;
import java.util.Scanner;

public class control_structure {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        // IF STATEMENT
        double grade;
        System.out.print("enter your name ");
        String name=inp.nextLine();
        System.out.print("enter your grade ");
        grade=inp.nextDouble();

        boolean valid=false;

        if(grade<=100 && grade>=0){
            valid=true;
            //you can use & but it has performance drawback
            //if(0<grade>100) NOT ALLOWED IN JAVA!!
            //If you use or operator "||" it checks first condition and if the first one is true it wont checks second condition
        }
        else {
            System.out.println("Your grade is not valid one");
        }
        String letter_grade="";//empty string
        if(valid==true){
            if(grade>=90) {
                letter_grade="AA";
            }
            else if(grade>=80){
                letter_grade="BA";
            }
            else if(grade>=70){
                letter_grade="BB";
            }
            else if(grade>=60){
                letter_grade="CB";
            }
            else{
                letter_grade="FF";
            }
            System.out.println(name+" "+"your letter grade is "+letter_grade);
        }
        else {
            System.out.println("your letter grade cannot be assigned");
            //This else means that if valid is not true, do that operations
        }

        //SWITCH STATEMENT

        String message="Dear"+" "+name+",";

        switch(letter_grade){
            case  "AA":
                message+="Wonderful job!";

            case "BA":
                message+="You have done great job!";
                break;
            case "BB":
                message+="good job!";
                break;
            case "CB":
                message+="Not bad! you pass";
                break;
            case "FF":
                message+="You failed work harder :(";
                break;
            default:
                message+="I cannot say anything yet";
             //if the message doesnt satisfy with these cases use default
        }
        System.out.println(message);//All cases should end with break!!









    }
}
