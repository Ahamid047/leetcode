class St{
    String name;
    static String schoolname;

    public static void changeschool(){
        schoolname ="kv";
    }
}
public class Abstraction {  
    public static void main(String[] args) {
        St.schoolname="Play way";
        

        //creating tthe object of class
        St stud = new St();
        // St.changeschool();
        System.out.println(St.schoolname);
        stud.name = "Abdul";
        stud.schoolname="jesus and mary";
        
    }
    
}
