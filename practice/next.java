class testing{
    int val;
    String name;

    //constructor building 
    // testing(String name, int val){
    //     this.name = name;
    //     this.val=val;
    // }
    testing(){
        System.out.println("object created");
    }



    public void write(){
        System.out.println("writing");
    }
}
public class next {
    public static void main(String[] args) {
        testing t = new testing();
        
        // t.val =345;
        // t.name = "Abdul";
        // t.write();
        

        // System.out.println(t.val);
        
    }
}
