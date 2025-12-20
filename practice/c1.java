class Student{
    String name;
    int age;

    //method of the class
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    } 

    //creating parameterized constructor
    // Student (String name, int age){
    //     this.name = name;
    //     this.age =age;
    // }
}
public class c1 {
    public static void main(String[] args) {
        //creating object for the class student

        Student s1 = new Student();
        s1.name = "Abdul";
        
        s1.printinfo();

        
    }
}
