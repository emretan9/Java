package giris;

import java.util.Arrays;
import java.util.Scanner;

public class countingArrayElement {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);//In order to see array with proper order,I sorted
        System.out.println(Arrays.toString(arr));//Printed sorted array

        System.out.println("Enter a element that you want to see how many times it occur?");
        int element= inp.nextInt();
        int occurance=0;//Occurance must be 0 at first
        for (int i = 0; i < arr.length; i++){
            if(arr[i]== element){ //i th element of array equals element that user entry increase occurance.
                occurance++;
            }
        }
        System.out.println("Element "+element+" repeated "+ occurance+" times");
        System.out.println("--------------------------------------------------------------");
        System.out.println("OTHER TYPE OF OUTPUT:");

        int five_occ=0,ten_occur=0,twenty_occur=0; //declaring occurance of array element separately.
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==5) five_occ++;//if array element equals to 5 increase the five occurance
            if(arr[i]==10) ten_occur++;
            if(arr[i]==20) twenty_occur++;
        }
        System.out.println("5 repeated "+five_occ+" times");
        System.out.println("10 repeated "+ten_occur+" times");
        System.out.println("20 repeated "+twenty_occur+" times");

    }
}
