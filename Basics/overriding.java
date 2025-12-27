class animal1{
    public void eat(){
        System.out.println("Eat");
    }
}
class goat extends animal1{
    @Override
    public void eat(){
        System.out.println("Grass");
    }
}

class lion extends animal1{
    @Override
    public void eat(){
        System.out.println("Meat");
    }
}

public class overriding {
    public static void main(String[] args) {
        animal1 obj = new animal1();
        goat obj1 = new goat();
        lion obj2 = new lion();
        obj.eat();
        obj1.eat();
        obj2.eat();

        
    }
}
