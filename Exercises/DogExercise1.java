package giris.Exercises;

class Dog{
    private String name;
    private int age;

    //constuctor
    public Dog(String name,int age){
        this.name=name;
        if(age <= 0) System.out.println("Enter valid age");
        this.age=age;
    }

    //getter methods
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    //setter methods
    public void setName(){
        this.name=name;
    }
    public void setAge(){
        this.age=age;
    }
    //converting dogs age in person age
    public int dogAgeToPersonAge(int age){
        this.age=age;
        int personAge=7*this.age;
        System.out.println();
        return personAge;
    }
    //toString method to see one line description of dog

    @Override
    public String toString() {
        return "Dog's name " +this.name+","+"age is "+this.age;
    }
}
public class DogExercise1 {
    public static void main(String[] args) {
        Dog dog=new Dog("kennel",2);
        System.out.println("Name of the dog with getName method: "+dog.getName());
        System.out.println("Age of the dog with getAge method: "+dog.getAge());
        System.out.println("Dog's age in person age: "+dog.dogAgeToPersonAge(2));
        System.out.println("Dog's info at one line with toString method "+dog.toString());
    }
}
/* OUTPUT:
Name of the dog with getName method: kennel
Age of the dog with getAge method: 2

Dog's age in person age: 14
Dog's info at one line with toString method Dog's name kennel,age is 2
*/
