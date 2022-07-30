package Projects;
import java.util.Scanner;

public class training_main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Workout Program...");
        String moves= "Valid workout moves...\n"
                +"Burpee\n"
                +"Pushup\n"
                +"Situp\n"
                +"Squat";
        System.out.println("Workout moves:\n"+moves);
        System.out.println("Creeate a workout plan:");
        System.out.println("Enter Burpee number");
        int burpee=scanner.nextInt();
        System.out.println("Enter Push up number");
        int pushUp=scanner.nextInt();
        System.out.println("Enter Sit up number");
        int sitUp=scanner.nextInt();
        System.out.println("Enter Squat number");
        int squat=scanner.nextInt();
        scanner.nextLine();

        //creating class
        training training=new training(burpee,pushUp,sitUp,squat);
        System.out.println("Your workout plan is starting...");

        while(training.isWorkOutFinish()==false){
            //if one of your move hasnt finished yet it will continue
            System.out.println("Move Type(Burpee,Pushup,Situp,Squat):");
            String moveType= scanner.nextLine();
            System.out.println("How many repeat you will do:");
            int number= scanner.nextInt();
            scanner.nextLine();//in order to avoid scanner error

            training.workOut(moveType,number);
        }



    }
}
/* OUTPUT:
Welcome to Workout Program...
Workout moves:
Valid workout moves...
Burpee
Pushup
Situp
Squat
Creeate a workout plan:
Enter Burpee number
50
Enter Push up number
50
Enter Sit up number
50
Enter Squat number
50
Your workout plan is starting...
Move Type(Burpee,Pushup,Situp,Squat):
pushup
How many repeat you will do:
10
You have more push up to do
Remaining push up number:40
Move Type(Burpee,Pushup,Situp,Squat):
squat
How many repeat you will do:
60
CONGRATS! You passed the squat number that you aim
Remaininng squat0
Move Type(Burpee,Pushup,Situp,Squat):

*/
