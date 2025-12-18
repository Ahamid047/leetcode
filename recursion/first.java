
public class first {

    public static void main(String[] args) {
        // int count = 0;
        rec(0);
    }

    public static void rec(int count) {
        if (count == 4) {
            System.out.println("none");
            return;

        }

        System.out.println(count);

        rec(count + 1);
    }
}
