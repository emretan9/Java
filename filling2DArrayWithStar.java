package giris;

import java.util.Arrays;

public class filling2DArrayWithStar {
    public static void main(String[] args) {
       // WRITING B WITH STAR SIGN USING 2D ARRAY
        String[][] array= new String[6][4];

        for(int i=0;i< array.length;i++){ //in order to reach whole elements of 2D array
            for(int j=0;j< array[i].length;j++){
                if(i==0 || i==2 || i==5) { // put * to rows 0 2 and 5
                    array[i][j] = "*";
                }
                else if(j==0 || j==2){ // put * to colum 0 and 2
                    array[i][j]="*";
                }
                else{   // other element should empty due to shape of char B
                    array[i][j]=" ";
                }
            }
        }
        for (String[] row : array){ //printing arrray
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
