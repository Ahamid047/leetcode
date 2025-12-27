
import java.util.Scanner;

class account{
    int pin = 987;
    float balance =0;


    public void validpin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int pin1 = sc.nextInt();
        if(pin == pin1){
            System.out.println("welcome");
            menu();
        }else{
            System.out.println("enter a valid pin");
        }
    }

    public void menu(){
        System.out.println("Enter you choice");
        System.out.println("1 for checking balance");
        System.out.println("2 for withdraw money");
        System.out.println("3 for deposit money");
        System.out.println("4 to exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice ==1){
            checkbalance();
        }else if(choice ==2){
            withdraw();
        }else if(choice == 3){
            deposit();
        }else if(choice ==4){
            return;
        }else{
            System.out.println("enter a valid choice ");
        }

    }
    public void checkbalance(){
        System.out.println("balance"+ balance);
        menu();
    }

    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        System.out.println("Amount want to withdraw");
        if(amt >balance){
            System.out.println("insufficient amt");
        }else if(amt <= balance){
            balance -= amt;
            System.out.println("available balance is"+ balance);
        }
        menu();
    }

    public void deposit(){
        System.out.println("amount you want to deposit");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if(amt<0){
            System.out.println("Enter a valid amount");
        }else {
            balance += amt;
            System.out.println("Available Amount is "+ balance);
        }
        menu();
    }

}
public class Atm {
    public static void main(String[] args) {
        account obj = new account();
        obj.validpin();
        
    }
}
