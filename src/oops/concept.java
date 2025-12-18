package oops;

public class concept {

    public static void main(String[] args) {

        student Abdul = new student();
        Abdul.rollno=4;
        Abdul.name="Abdul";
        Abdul.marks=88;

        System.out.println(Abdul.rollno);
        System.out.println(Abdul.name);
        System.out.println(Abdul.marks);

        
    }
}
class student{
    int rollno;
    String name;
    float marks =90;

    public student() {
        // s.name =name;
        this.rollno = rollno;
        this.marks=marks;

    }

    
}