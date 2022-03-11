package ACM321;
import java.util.Scanner;
public class LoopExamples {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
        //USAGE OF BREAK STATEMENT
        int count=0;
        while (true){
          System.out.println(count);
           count++;
            if(count==10) break;
        }
        System.out.println("--------------------------------------");

        //NESTED LOOPS
        final int class_size=10; //declaring class_Size as constant and 10
        int grade;
        boolean isValid=false;//we declared the boolean operator to doing the operation as many as isValid is true.
        for(int i=1;i<=class_size;i++){
            do {
                System.out.println("Enter" + i + " th student grade: ");
                grade = inp.nextInt();
                // you can write isValid(grade>=0 && grade<=100) ? true: false; instead of if's.
                if(grade>=0 && grade<=100){
                    isValid=true;
                }
                else{
                    isValid=false;
                    System.out.println("Enter grade again");
                }

            } while(!isValid);//Statement same with isValid==false
            //when isValid is true do that operations
        }
    }
}
