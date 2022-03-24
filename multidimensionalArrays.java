package giris;

import java.util.Arrays;

public class multidimensionalArrays {
    public static void main(String[] args) {
          int[][] matris= new int[6][6];
          // [row][column]

          matris[0][0]=0;
          matris[2][3]=839;
          System.out.println(matris[2][3]);

          int[][] list={
                  {0, 453, 939, 243, 783, 891},
                  {453, 0, 490, 384, 620, 439},
                  {939, 490, 0, 839, 863, 423},
                  {243, 384, 839, 0, 544, 823},
                  {783, 620, 863, 544, 0, 1045},
                  {891, 439, 423, 823, 1045, 0}
          };
        System.out.println(list[5][4]);//It will print 5.row and 4. column element
        System.out.println(Arrays.deepToString(list));//This is how to print 2D array


        for (int[] row : list){
            //Converting each row as string and then printing in a separate line
            System.out.println(Arrays.toString(row));
            //This version of printing array allow you to see array with 2D shape.
        }
        System.out.println("--------------------------------------------------------------------");

        //FILLING MULTIDIMENSIONAL ARRAY WITH INCREMENTING NUMBER TO 12( 12 because of shape)


        int[][] array1= new int[3][4];
        int number=1;

        for(int i=0;i<array1.length;i++){  //At first for loop we obtain array1[i] which is array1[0](because of index)
            for(int j=0;j< array1[i].length;j++){ // This for loop means that we start the counter and increase by the length of the line it travels.
                array1[i][j]=number++;
                /*
                Array[i] started with zero .Then it continiue to find 0th(index) rows first column
                which is array1[j] then starts second for loop ,array1[i] and array[j] is 0
                 because loop start with 0 until the find array[i] size, after that array[j] increase by
                 variable number which is 1 and so on...
                 */
            }
        }
        for (int[] row : array1){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("--------------------------------------------------------------------");

        //FILLING MULTIDIMENSIONAL ARRAY WITH RANDOM NUMBER FROM 1 TO 10

        int[][] array2= new int[3][4];

        for(int i=0;i<array2.length;i++){
            for(int j=0;j< array2[i].length;j++){ //We entered inside the array with array[i] and we are filling array with traveling inside array at for loop.
                array2[i][j]=(int)(Math.random()*10)+1;
            }
        }
        for (int i=0;i< array2.length;i++){ //This is other kind of 2D array printing method.
            for(int j=0;j<array2[i].length;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();//I added the empty sout in order to get next line
        }



    }
}
