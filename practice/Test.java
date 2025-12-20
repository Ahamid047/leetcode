class Test1{
    int a;

    
    Test1(int a){
        this.a = a; //constructor 

    }
    public void call(){
        System.out.println(this.a);
    }


}
public class Test{
    public static void main(String[] args) {
        Test1 t = new Test1(10);  //object creation
        t.call(); 

    }   
}


// class Test1{
//     int a;

//     public void call(){
//         System.out.println("Function called");
//     }


// }
// public class Test{
//     public static void main(String[] args) {
//         Test1 t = new Test1();  //object creation 
//         t.a=10;
//         t.call();
//     }
    
// }
