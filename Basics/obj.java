class Car00{
    String color;
    int price;

    void display(){
        System.out.println("The color of car is "+ color+" and price is "+price);

    }
}
public class obj{
    public static void main(String[] args) {
        Car00 Mycar= new Car00();
        Mycar.color = "blue";
        Mycar.price = 344555;
        Mycar.display();

        Car00 car2= new Car00();
        car2.color="blue";
        car2.price =300000;
        car2.display();

        
    }
}

