class Stud {
    String name;
    int age;

    Stud(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class base {
    public static void main(String[] args) {
        Stud s1 = new Stud("Abdul", 21); 
        s1.printinfo();
    }
}
