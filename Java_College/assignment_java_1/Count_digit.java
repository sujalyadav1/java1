package assignment_java_1;
import java.util.*;
public class Count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int rev = n % 10;
            count ++;
            n=n/10;
        }
        System.out.println("the count of the digit is : " + count);
    }
    
}
