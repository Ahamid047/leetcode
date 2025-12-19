
public class finallyy {
    public static void main(String[] args) {
        final int y = 20;
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally always runs");
        }
        System.out.println(y);
    
        System.out.println(y);


    }

}
