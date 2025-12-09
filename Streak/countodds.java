
import java.util.Scanner;
public class countodds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number up to which you want to count for odd numbers (inclusive):");
        int low = sc.nextInt();
        int high = sc.nextInt();

        if(low%2==0){
            low++;
            
        }
        if(high%2==0){
            high--;
        }
        int count= (high-low)/2+1; 
        System.out.println("The odd numbers are " + count);
    }
}
