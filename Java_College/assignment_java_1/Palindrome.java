package assignment_java_1;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int temp = n;
        int m = 0;
        int rev;
        while(n>0){
            rev= n % 10;
            m = m * 10 +rev;
            n = n/ 10;
        }
        if(m==temp){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
