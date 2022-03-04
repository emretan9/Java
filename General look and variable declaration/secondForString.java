package ACM321;

import java.util.Locale;

public class secondForString {
    public static void main(String[] args) {
        String x="Hi! my name is emre";
        String course_name="Acm321";
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

        String department="ACM";
        String code="431";
        String course_code=department+code;

        /*to compare to string, we cannot use == operator
          instead we need to use one of following method */

        System.out.println("Course code correct one?"+course_name.equals("ACM321"));
        // it returns false because java is case sensitive orginal string is Acm !!

        //Second way to compare strings (no case sensitive)
        System.out.println("Course code correct one?"+course_name.equalsIgnoreCase("ACM321"));

        //There exist a third method option:
        System.out.println("Course code correct one?"+course_name.compareTo("ACM321"));
        //finds the different char and it prints the difference between them at ascii table(C is 67 and c is 99 diff=32)

        //Ignoring case sensitiveness with compareTo()
        System.out.println("Course code correct one?"+course_name.compareToIgnoreCase("ACM321"));

        //Concatenation
        String fName="emre";
        String sName="tanrıkulu";
        System.out.println(fName+" "+sName);

        String course_code2=department.concat(code).concat(":object oriented programing");
        System.out.println("they are equal?"+(course_code.equals(course_code2)));
        System.out.println(course_code2);

        //Formatted output
        double per_liter=1.215962441314554;
        System.out.println(per_liter);
        //I just want to display two decimal digit
        System.out.printf("This is way to print per_liter with 2 floating point number %.2f",per_liter);
        System.out.printf("\n per_liter is %10.2f",per_liter);
        System.out.printf("\n per_liter is %20.2f",per_liter);

        System.out.printf("\n Course code is %d",321);
        System.out.printf("\n Course code is %10d",321);
        System.out.printf("\nMy name is %s","emre");
        System.out.println("\n");

        //Escape sequence
        System.out.println("I said \"hello\" to you");
        System.out.println("I said 'hello'to you");
        System.out.println("I want to go doctor\take medicine ");
        /*
        \b = backspace
        \t = tab
        \n = newline
        \\ = backslash
        */







    }
}
