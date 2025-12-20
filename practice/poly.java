class Student{
    String name;
    int age;

    public void print(String name){
        System.out.println("the name is "+ name);
    }

    public void print(String name, int age){
        System.out.println(name+ " "+ age);
        
    }
}
public class poly {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Abdul";

        s1.print(s1.name );


    }
}
