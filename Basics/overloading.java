class E {
    public void sum1(int a, int b) {
        System.out.println(a + b);
    }

    public void sum1(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
//Method overloading when only have to change the parametr for the differnet function 
public class overloading {
    public static void main(String[] args) {
        E obj = new E();  
        obj.sum1(4, 5);
        obj.sum1(4, 5,8);
    }
}
