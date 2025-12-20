class car{
	String color;
	
	int price;

	public void fxn(){
		System.out.println("Travelling");
	}

	//if wants to return all the info of the object created
	// this is called constructor
	public void info(){
		System.out.println(this.color);
		System.out.println(this.price);

	}

}
public class concept{
	public static void main(String[] args) {
		//creating the object 
		car car1= new car();
		car1.color = "blue";
		car1.price=5000000;

		// car1.fxn();   //calling the method 

		// creating another object
		car car2 = new car();
		car2.color="black";
		car2.price=6000000;

		car1.info();
		car2.info();

		
	}
}