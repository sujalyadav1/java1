package assignment_java_1;
import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of n natural number is : "+ sum);
    }
}