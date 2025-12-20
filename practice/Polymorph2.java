
class Student {
    String name;

    public void print() {
        System.out.println("I am a student");
    }
}
class CollegeStudent extends Student {

    @Override
    public void print() {
        System.out.println("I am a college student");
    }
}
public class Polymorph2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new CollegeStudent(); // parent reference

        s1.print();  // calls Student's method
        s2.print();  // calls CollegeStudent's method
    }
}
