
class Student1{
    String name;
    int age;

    public void print(String name){
        System.out.println("the name is "+ name);
    }

    public void print(String name, int age){
        System.out.println(name+ " "+ age);
        
    }



}
public class Polymorph{
    public static void main(String args[]){
        Student1 s1 = new Student1();
        s1.name = "Abdul";
        s1.age = 21;

        s1.print(s1.name , s1.age);


    }
}
