
class Student1{
    String name;
    int age;

    public void print(String name){
        System.out.println("the name is "+ name);
    }

    public void print(String name, int age){
        System.out.println(name+ " "+ age);
        
    }
//Note: Demonstrates method overloading, which is a type of compile-time polymorphism in Java
// Both methods are named print
// They have different parameter lists
// This is called method overloading
// Java decides which method to call at compile time based on arguments


}
public class Polymorph{
    public static void main(String args[]){
        Student1 s1 = new Student1();
        s1.name = "Abdul";
        s1.age = 21;

        s1.print(s1.name , s1.age);


    }
}
