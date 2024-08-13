import java.util.Scanner;

public class Bai_tap_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the number: ");
        double res=1, n , sum=1 , so=1 , even=0 ;
        n = Double.parseDouble(scanner.nextLine()) ;
        while(so < n) {
            so++;
            res *= so;
            sum += so;
            if (so % 2 == 0) {
                even += so;
            }
        }
        System.out.println("The sum of all integers from 0 to n is "+sum);
        System.out.println("The product of all integers from 1 to n is "+res);
        System.out.println("The sum of all even integers from 0 to n is "+even);
    }
}
