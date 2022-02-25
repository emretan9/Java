package ACM321;

public class İLK {
    static  final int CLASS_SIZE=52;
    public static void main(String[] args) {
        byte age=5;
        int age_universe=1000000000;
        double mass_Of_milkyway=1E11; //10^11
        double size_of_atom=1E-16;//10^^(-16)
        boolean flag=true;// or false
        char character='c';
        int x,y;
        x=10;
        y=3;
        int sum= x+y;
        int diff=x-y;
        int multiplication=x*y;
        double divide=(double) x/y;
        System.out.print(divide);
        /*to find the remainder of division,u need to use % */
        int remainder=x%y;
        /*combination float and integer */
        double pi=3.14;
        double result=pi*x;
        System.out.print(age_universe);
        System.out.println(size_of_atom);
        System.out.println("age of universe is "+age_universe);
        System.out.printf("%d",multiplication);

        /*constant declaretion*/
        final double pi1=3.14;
        //if you write pi1=2.71; it will be error beacuse pi1 is now constant

        /* static final */
        System.out.println("\n"+CLASS_SIZE);
        //before public void add static final so it can be accessable at func

        /*Pre and post Increment/Decrement*/
        System.out.println(y++);
        System.out.println(++y);
        System.out.println(y--);
        System.out.println(--y);

        /*Power and Square root*/

        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(2,5));//first argument is base and second one is power
        System.out.println(Math.round(11.85));//closest number

        /*Logarithm Calculations */
        System.out.println(Math.log10(10));
        System.out.println(Math.log10(Math.pow(10,2)));

    }
}
