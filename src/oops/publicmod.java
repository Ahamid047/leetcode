package oops;
class first{
    int n=10;
    public void write(){
        System.out.println("writing");
    }
    
}
public class  publicmod{
    public static void main(String[] args) {
        first obj = new first();
        obj.write();
        System.out.println(obj.n);

    }
}


