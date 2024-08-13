import java.util.Scanner;

public class Bai_tap_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String confirm = "Y" ;
        double sum = 0 ;
        while(confirm.equals("Y")){
            System.out.println("Enter a number: ");
            double n = Double.parseDouble(scanner.nextLine()) ;
            sum += n ;
            System.out.println("Do you want to continue?");
            confirm = scanner.nextLine() ;
        }
        if(confirm.equals("N")){
            System.out.println("The sum of all numbers you have just entered is "+sum);
        }
    }
}
