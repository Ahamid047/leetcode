class animal{
    public void print(){
        System.out.println("running");
    }
}

class dog extends animal{
    public void bark(){
        System.out.println("barking");
    }
}
public class singleinher {
    public static void main(String[] args) {
        dog an1 = new dog();
        an1.bark();
        an1.print();
        
    }
}
