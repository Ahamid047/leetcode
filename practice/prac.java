class S {
    String name;
    int age;

    S(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class prac {
    public static void main(String[] args) {

        S st1 = new S("Abdul", 21);
        S st2 = new S("Anas", 20);
        S st3 = new S("Rahul", 22);

        st1.info();
        st2.info();
        st3.info();
    }
}

// class S{
//     String name;
//     int age;

//     S(String name, int age){
//         this.name =name;
//         this.age =age;

//     }

//     // public void info(String name , int age){
//     //     System.out.println("The name of the student is "+this.name);
//     //     System.out.println("The age of the student is "+this.age);
//     // }
// }
// public class prac {
//     public static void main(String[] args) {
//         S st = new S();
//         st.name = "Abdul";
//         st.age = 21;
//         // st.info();
        
//     }
// }
