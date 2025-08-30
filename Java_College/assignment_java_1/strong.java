package assignment_java_1;
import java.util.*;
public class strong {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int digit = n%10;
            int fact=1;

                for(int j=1;j<=digit;j++){
                fact=fact*j;
            }
            sum=sum+fact;
            n/=10;

        }
        if(sum==temp){
            System.out.println("strong");
        }
        else{
            System.out.println("not strong");
        }
    }
}
