import java.util.*;

public class reverse{
    static int reverseNumber(int num){
        int r = 0;
        while(num > 0)
        { int k = num % 10;
        r = r * 10 + k;
        num = num / 10;}
        return r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("after the reverse the value is: ");
        System.out.println(reverseNumber(num));
        
    }
}