package ACM321;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        // DECLARING ARRAY

           //If you want to declare array first ,then  you want to add value
        int[] list=new int[10];
        /*
        1-)int[] means type of array
        2-)list is the name of array
        3-)new indicates that we create something new at objects
        4-)int[10] means the size of array */

        int list2[]=new int[20];// other type of array declaration.
        //that is rare usage so avoid !!

        list[0]=10;
        list[1]=20;
        list[2]=30;
        list[3]=40;
        System.out.println("2nd element is "+list[1]);
        System.out.println("size of array "+list.length);
     //If you get ArrayIndexOutOfBondsException error code note that you entered wrong index which is larger size than we entered.
        System.out.println("--------------------------------------------------");
     //OTHER TYPE OF DECLARATION
     int[] list3={10,20,30,40,50,60};
        System.out.println("5th element of array is "+list3[4]);
        for(int i=1;i < list3.length;i++){
            // If you add = before list3.length,it adds 6. index of array which cause out of bounds error!!
            System.out.println(i+"th index of array is :"+list3[i]);
        }
        System.out.println("--------------------------------------------------");

        //GET INPUT TO ARRAY
        System.out.println("list array is incrementing by 10");
       for(int i=0;i<list.length;i++){
           list[i]=(i*10)+10;
           //In order to get ascending order by 10, for each time multiply i by ten and add 10.
           System.out.println(list[i]);
       }
        System.out.println("---------------------------------------------------");

       //PRINTING ARRAY WİTH REVERSE ORDER
        System.out.println("list 3 array in reverse order: ");
        for(int i= list3.length-1;i>=0;i--){
            System.out.println(list3[i]);
        }

        System.out.println("---------------------------------------------------");
        //Instantiate n array of integer which store 10 integer items.
        System.out.println("filling array with randon integers between 0 and 10");
        final int size=10;
        int[] random_numbers = new int[size];

        Random rand_generator = new Random();
        for(int i=0;i>=random_numbers.length;i++){
            random_numbers[i]=rand_generator.nextInt(10)+1;
        }
        //System.out.println(random_numbers);
       //count number of occurance each number in given array
       int[] counter= new int[11];
        int value;
       for(int i=0;i<random_numbers.length;i++){
           value=random_numbers[i];
           counter[value]++;
       }
       for(int j=1;j<counter.length;j++){
           System.out.println(" of "+j+"="+counter[j]);
       }
       System.out.println("---------------------------------------------------");
       //copying array
        //copying arrray element with this way is wrong: int[] copy=random_numbers;
           int[] copy=new int[size];
           for(int i=0;i<random_numbers.length;i++) {
              copy[i]=random_numbers[i];
            }
        System.out.println("---------------------------------------------------");
        
        
        
        //STRING ARRAYS
        
         String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        //Second type of string array declaration
        String[] teams= new String[]{"Fenerbahce","Galatasaray"};
        System.out.println(teams.length);

        //How to print array
        for(int i=0;i<= (days.length-1);i++){
            System.out.println(days[i]);
            //Array size is 7 but index number is smaller by 1 than array size.Thats why we use (days.length-1)
        }

        
        
    }
}
