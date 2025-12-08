class Car{
    String color;
    int price;

    void display(){
        System.out.println("The color of car is "+ color+" and price is "+price);

    }
}
public class objectclass {
    public static void main(String[] args) {

        Car Mycar= new Car();
        Mycar.color = "blue";
        Mycar.price = 344555;
        Mycar.display();

        
    }
    
}
