import java.util.*;

public class question{
    static int palindrome(int num){
        int k,rem = 0;
        while(num > 0)
        { k = num % 10;
        rem = rem * 10 + k;
        num = num / 10;}
        if (num == rem){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome");
        }

        return rem;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println(palindrome(num));
    }
}