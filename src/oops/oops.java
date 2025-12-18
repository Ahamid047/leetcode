

package oops;

//access modifiers

class data {
    //data fields
    int rollno;
    String name;
    int age;

    //methods
    public void print(int rollno, String name, int age){
        this.rollno = rollno;
        this.name =name;
        this.age=age;
    }

}

public class oops{
    public static void main(String[] args) {
        data obj = new data();
        obj.print(1,"Abdul", 21);
        System.out.println(obj.rollno);
        System.out.println(obj.name);
        System.out.println(obj.age);
        
    }

}
