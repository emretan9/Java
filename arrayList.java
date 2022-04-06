package giris;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> arraylist= new ArrayList<String>();

        arraylist.add("Fenerbahce");//adding values into arraylist
        arraylist.add("gs");
        arraylist.add("bjk");
        arraylist.add("brooklyn");
        arraylist.add("Fenerbahce");

        System.out.println("First team is "+arraylist.get(0));//index number
        System.out.println("third and smallest team is "+arraylist.get(2));

        System.out.println("Size of arraylist is "+arraylist.size());
        arraylist.remove("brooklyn");//or u can arraylist.remove(3) (index num) instead of this
        System.out.println("Our arraylist look like this after delete brooklyn:");
        for(int i=0;i< arraylist.size();i++){
            System.out.print(arraylist.get(i)+" ");
        }

        System.out.println("\ngs is at index no: "+arraylist.indexOf("gs"));
        System.out.println("Second Fenerbahce is at index no: "+arraylist.lastIndexOf("Fenerbahce"));

        arraylist.set(3,"Nets");//It updates the arraylist element
        System.out.println("Second Fenerbahce change to "+arraylist.get(3)+" and updated arraylist looks like this");
        for(int i=0;i< arraylist.size();i++){
            System.out.print(arraylist.get(i)+" ");
        }










    }
}
