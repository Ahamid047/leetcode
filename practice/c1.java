class Students{
    String name;
    int age;

    //method of the class
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    } 

    //creating parameterized constructor
    Students (String name, int age){
        this.name = name;
        this.age =age;
    }
}
public class c1 {
    public static void main(String[] args) {
        //creating object for the class student

        Students s1 = new Students("Abdul", 21);
        // s1.name = "Abdul";
        
        // s1.age=21;
       
        s1.printinfo();
        // System.out.println();

        
    }
}
