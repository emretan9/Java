package ACM321;
import java.util.Arrays;
public class ArrayDelete {
    public static void main(String[] args) {
        int[] sayilar={3,5,12,17,20};

        int index=1;


        int last= sayilar.length-1;
        System.out.println("before delete :"+Arrays.toString(sayilar));
        for(int i=index;i<last;i++){ //start from index number and come until find the last index.
            sayilar[i]=sayilar[i+1];
            //i th element of array would be i+1 th element of array in order to slide array to left until reach the final.
            //actually we dont delete the element ,we just lost the number which is defined as index=1
        }
        last--;
        System.out.println("after delete:"+ Arrays.toString(sayilar));


    }
}
