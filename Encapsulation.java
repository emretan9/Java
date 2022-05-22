package giris;
class Book{
    private String name;
    private int pageNumber;

    public Book(String name,int pageNumber){
        this.name=name;//we said that they are same as we metioned before
        if(pageNumber<0) pageNumber=0;
        this.pageNumber=pageNumber;
    }
    public int showPageNumber(){
        return this.pageNumber;
    }
    public void changePageNumber(int pageNumber){
        if(pageNumber<0) pageNumber=0;//In order to avoid writing book number less than 0
        this.pageNumber=pageNumber;
    }

    //GETTER AND SETTER
    public String getName(){
        //private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.
        //The get method returns the variable value, and the set method sets the value.
        //get"we add name of qualification" at here we used getName because qualification name is name;
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }





}
public class Encapsulation {
    public static void main(String[] args) {
        Book book1=new Book("The hunger games",380);
        Book book2=new Book("Lord of rings",385);

        //If ı said public int pageNum I can change it here like pageNum=100;
        //I hided to acces to pageNumber outside book class so I need another constuctor reach it at here
        //I cant see page number like "System.out.println(book2.pageNumber);" because I made it private

        /* WHAT WE ACTUALLY DID HERE:
        * Firstly we made pageNum as private so we cant control it outside of class
        * After that we generated constructor and we controlled pageNum with if statement to not entering negative number.
        * After all that changes we can still enter a negative number at main function like book2.pageNum=-100
        * We finally generated chagePageNumber constructor and we added if statement to avoid negative number.
        * Conclusion we closed all door to enter negative book number.We call that operation to ENCAPSULATION
        * Encapsulation allow us to create security shield on objects.At our example we create shield on book
          which we couldnt enter negative book number
         */
        book2.changePageNumber(3800);//I change the pageNum as ı made at constructor
        System.out.println("Name of second book:");
        System.out.println(book2.getName());
        System.out.println("Page number of Lord of rings is:");
        System.out.println(book2.showPageNumber());
        System.out.println("This is the way of chaning name of second book: book2.setName(\"saftirik\");");
        book2.setName("saftirik");
        System.out.println("Edited name of second book is:");
        System.out.println(book2.getName());
    }
}

/* OUTPUT:
Name of second book:
Lord of rings
Page number of Lord of rings is:
3800
This is the way of chaning name of second book: book2.setName("saftirik");
Edited name of second book is:
saftirik

 */
