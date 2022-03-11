package ACM321;
import java.util.Scanner;
import java.util.Random;
public class LoopStatements {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        // WHILE LOOP
        //you have 2 options to generate random integers in given range.
          //1.way:use Math class
         int count=0;
         String answer="yes";
          while (count<10) {
             int random_number=(int)(6*Math.random())+1;//this generates random number between 1 and 6.
             System.out.println(random_number);
             count++;
         }
    while (answer.equalsIgnoreCase("yes")){
        int random_number=(int)(6*Math.random())+1;//this generates random number between 1 and 6.
        System.out.println(random_number);
        System.out.println("do you want to continiue?");
        answer=inp.nextLine();
        // Until I give another input rather than yes it gives random number

    }

       //DO-WHILE
         do{
             int random_number=(int)(6*Math.random())+1;//this generates random number between 1 and 6.
             //Math.random only generates numbers between 0 and 1 in order to get 6 we should multiply with 6.
             //+1 means that random library's starting point is 0.0 so in order to get between 1 and 6 we add +1
             System.out.println(random_number);
             count++;//If you dont write count its begins infinity loop
             System.out.println("do you want to continiue?");
             answer=inp.nextLine();
         }
         while(count<10 && answer.equalsIgnoreCase("yes"));

         //Do the operation before up to count<10
        System.out.println("-------------------------------------");

        //FOR STATEMENT
         // 2. way generating random integers in given range

        Random random_generator= new Random();
        for(int i=1;i<=10;i++){
            int rand=random_generator.nextInt(6)+1;
            System.out.println(rand);
        }




        //Lets make a countdown
        System.out.println("enter starting point:");
        int x=inp.nextInt();
        for(int i=x;i>=0;i--){
            System.out.println("countdown\t"+i);
            if(i==0) System.out.println("reach");
        }


       for(int i=10,j=1;i<=j;i--,j++){
           System.out.printf("%d * %d = %d\n",i,j,i*j);
       //Thats rarely usage of for loop
       }

    }
}
