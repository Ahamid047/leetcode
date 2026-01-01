
public class nestedinterface {

    public static void main(String[] args) {
        Z obj = new Z();
        System.out.println(obj.isOdd(4));

    }
}

class Y {

    public interface nestedInterface {

        boolean isOdd(int num);
    }
}

class Z implements Y.nestedInterface {

    public boolean isOdd(int num) {
        return (num & 1) == 1;

       //num & 1 checks the last bit
       // If last bit is 1 → number is odd
    }
}
