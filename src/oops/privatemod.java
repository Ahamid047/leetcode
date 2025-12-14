package oops;

//WE HAVE TO USE THE GETTER AND SETTER PUBLIC METHODS TO THAT PROVIDE CONTROLLED ACCESS TO PRIVATE DATA MEMBERS.

class person{
    private String name;
    public void setname(String name){
        this.name =name;

    }
    public String getname(){
        return name;
    }
}

public class privatemod {
    public static void main(String[] args) {
        person p = new person();
        p.setname("ABDUL");
        System.out.println(p.getname());
        
    }
}
