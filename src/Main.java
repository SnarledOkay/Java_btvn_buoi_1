import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String defaultUsername = "techmaster", defaultPassword = "hoclacoviec" ;
        double balance = 1000000 ;
        System.out.println("Enter username: ");
        String username = scanner.nextLine() ;
        System.out.println("Enter password: ") ;
        String password = scanner.nextLine() ;
        String confirm ;
        if(username.equals(defaultUsername) && password.equals(defaultPassword)){
            do{
                System.out.println();
                System.out.println("Your username: " + defaultUsername);
                System.out.println("Your password: " + defaultPassword);
                System.out.println("Your current balance: " + balance) ;
                System.out.println("Enter the amount you want to withdraw: ");
                double money = Double.parseDouble(scanner.nextLine()) ;
                LocalTime withdrawalTime = LocalTime.now() ;
                System.out.println("You have withdrawed " + money + "VND at " + withdrawalTime);
                balance -= money ;
                System.out.println("Do you want to continue?");
                confirm = scanner.nextLine() ;
            }
            while(confirm.equals("Y")) ;
            if(confirm.equals("N")){
                System.out.println("Thank you for using our service, have a nice day!");
            }
        }
        else{
            System.out.println("Username or Passwork is incorrect");
        }
    }
}