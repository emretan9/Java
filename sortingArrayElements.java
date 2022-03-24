package giris;
import java.util.Arrays;
import java.util.Scanner;
public class sortingArrayElements {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int size;
        System.out.print("Enter a arrray size:");
        size= inp.nextInt();
        int[] array=new int[size];
        for(int i=1;i< array.length;i++){
            System.out.print("Enter "+i+" th element of array:");
            array[i]= inp.nextInt();
        }
        System.out.println("our array is "+Arrays.toString(array)+" without sorting");
        Arrays.sort(array);
        System.out.println("our array is "+Arrays.toString(array)+" with sorting");
    }
}
