package assignment_java_1;
import java.util.*;

public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int rev = n % 10;
            sum += rev;
            n = n / 10;
        }
        System.out.println("The sum of the digit of the fiven number is: "+ sum);
    }
    
}
