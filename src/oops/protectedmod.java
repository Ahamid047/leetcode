package oops;

class Vehicle {
    protected int speed = 50;
}

class Bike extends Vehicle {
    void setSpeed(int s)
    {
        speed = s; 
    }

    int getSpeed()
    {
        return speed;
    }
} 

public class protectedmod{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.setSpeed(100);
        System.out.println(b.getSpeed());

        Vehicle v = new Vehicle();
        System.out.println(v.speed);
    }
}
