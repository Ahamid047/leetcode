interface A{
    public void print();
    void show();
}
//inheritance 
class B implements  A,D{
    public void print(){
        System.out.println("class 2");
    }
     public void show(){
        System.out.println("showing");
    }
    int a ;
    
}
class C implements A,D{
    public void print(){
        System.out.println("class 3");
    }
    public void show(){
        System.out.println("show2 ");
    }
    public void fxn(){
        System.out.println("newone");
    }
}

interface D{
    final int a=2;
    // public void fxn();

}


public class interfaceinheritance {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();
        obj.show();
        // D obj2 = new B();
        
        // You don’t need to create an object to access a variable from an interface

        System.out.println(D.a);
        // D obj2 = new C();
        // obj2.print();
        // obj2.fxn();
    }
}
