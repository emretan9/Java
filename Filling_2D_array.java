package giris;
import java.util.Scanner;
public class Filling_2D_array {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int row=0,column=0;

        System.out.print("In order to create 2D array let's enter row size:");
        row= inp.nextInt();
        System.out.print("Now let's enter column size:");
        column= inp.nextInt();

        int[][] array= new int[row][column];
        System.out.println("Enter array elements:");
        for( row=0;row < array.length;row++){//At first for loop we obtain array1[i] which is array[0](because of index)
            for( column=0;column < array[row].length;column++){//We entered inside the array with array[row] and we are filling array with traveling inside array at for loop.
                array[row][column]= inp.nextInt();
                /* array[row] ile satırı aldık index olduğu için 0 dan başladı ve yukarıda belirttiğimiz array row size kadar artacak
                ardından 0. satırın 1. sütununu doldurmamız için 2.for loop'u başlattık 0. satırın (0.satırın değeri 1. sütundur) içini henüz doldurmadığımız için for loop içinde
                array[row] kadar ilerle dedik.*/
            }
        }
        System.out.println("We filled array and our 2D array looks like this -> ");
        for (int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
