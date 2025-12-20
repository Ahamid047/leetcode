
class Shapes{
    String color;

    public void printcolor(){
        System.out.println("Color is "+ color);

    }
}

class triangle extends Shapes{
    

}


public class Inherit {
    public static void main(String[] args) {
       triangle t1= new triangle();
       t1.color="red";
       t1.printcolor();
        
    }
}


//NOTE: Its type:
// Single level: when  a child class inherit the properties from the single parent class
// Multi level : when a class B inherit from the parent A  and then another class C  inherit from this class B
// Hierarchical level : when two different classes B and C inherited form the class A this is called inhertiance
