package ACM321;

import java.util.Locale;

public class secondForString {
    public static void main(String[] args) {
        String x="Hi! my name is emre";

        System.out.println(x);
        System.out.println(x.length());//Also it adds space's.

        /*you can convert into upper/lower case*/
        System.out.println(x.toUpperCase());// ".toLowerCase()"converts it to lower form.

        /*you can also get part of given string*/
        //for example firt three chars of given string.

        System.out.println(x.substring(0,8));//first part is starting index and second part is ending index.
        System.out.println(x.substring(5));//if I want to get remaining of chars of string.starts with only begining index

        /*you can check the existence of word(sequence of character) in given string*/
        System.out.println(x.contains("emre"));//It returns true or false(boolean)
        System.out.println(x.contains("Emre"));//It will be false because java is key senstive
    }
}
