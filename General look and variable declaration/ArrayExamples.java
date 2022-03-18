package ACM321;

import java.util.Scanner;
import java.util.Arrays;


public class ArrayExamples {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] names = new String[5];
        int[] grades = new int[5];
        names[0] = "emre";
        names[4] = "berkay";

        for (int i=0;i< names.length;i++){
            if(names[i] != null) {  //In order to avoid from filling null element with value doing tahis thing
                System.out.println("Enter a grade for " + names[i] + ":");
                grades[i] = inp.nextInt();
                if (grades[i] < 0 || grades[i] > 100) {
                    System.out.println("Grade is invalid");
                }
            }
        }

            //System.out.println("item no "+(i+1)+names[i]);
            //this is printing array
            //index is starting with 0 so in order to start count with 1 we use (i+1)
            //i<=names.length-1 or i<names.length


            System.out.println("----------------------------------------------------");

            String[] copy_names = Arrays.copyOf(names, names.length);
            System.out.println(Arrays.toString(names));

            System.out.println("-----------------------------------------------------");

            //ARRAY SORTING WITH CLASS METHOD

            Arrays.sort(grades); //This function sorts array with ascending order.We can use it when we want to arrange to number!!
            System.out.println(Arrays.toString(grades));

            System.out.println("-----------------------------------------------------");

            //FINDING MIN AND MAX ELEMENT IN GIVEN ARRAY

            int[] numbers = new int[50];
            for (int a = 0; a < numbers.length; a++) {
                numbers[a] = (int) (Math.random() * 100);//In order to get numbers between 0 and 100 we multiply with 100 remind it !
            }
        System.out.println("Before using sort() function ->"+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After using sort() function ->"+Arrays.toString(numbers));
            int min, max;
            min = max = numbers[0];//max and min have no array element before we compare it
            for (int y=0; y < numbers.length;y++) {
                if (min > numbers[y]) //If array element is smaller than minimum that means this array element is smallest element.
                    min = numbers[y];
                if (max < numbers[y]) //If array element is bigger den maximum that means biggest element is this element.
                    max = numbers[y];
            }

            System.out.println("min=" + min + "," + "max=" + max); //Printing maximum and minimum element.

            System.out.println("-----------------------------------------------------");

            //finding the searched item in array
            //suppose ı want to find term 33 exit in numbers or not

            int searched = 33;
            for (int x = 0; x < numbers.length; x++) {
                if (numbers[x] == searched) {
                    //We are reaching array elements with counter x.That If means "If array element is equal to variable called searched do this operations".
                    System.out.println("the term " + searched + " is found at index " + x);//Printing searching element with existing index.
                    break;
                }
            }
    }
}
