
include 'somefile';
class test {

}

class oops{
    private String s = "Hamid";
    public  void getright(){
        write();
        
    }
    private static void write(){
        System.out.println("calling private function");
    }
}
class Main extends oops {
    public static void main()throws Exception {



        oops obj = new oops();
        obj.getright();
                   
    }
}

// import java.lang.reflect.Method;

// class oops{
//     private void write(){
//         System.out.println("calling private function");
//     }
// }
// class Main {
//     public static void main()throws Exception {
//         oops obj = new oops();
//         // obj.write();
//         Method m = oops.class.getDeclaredMethod("write");
//         m.setAccessible(true);   // bypass private

//         m.invoke(obj);             
//     }
// }


// import java.lang.reflect.Method;

// class Test {
//     private void show() {
//         System.out.println("Private method called via reflection");
//     }
// }

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Test t = new Test();

//         Method m = Test.class.getDeclaredMethod("show");
//         m.setAccessible(true);   // bypass private

//         m.invoke(t);             // call private method
//     }
// }
