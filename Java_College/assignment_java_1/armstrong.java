package assignment_java_1;
import java.util.*;
public class armstrong {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp=n;
        while(temp>0){
            int digit = temp%10;
            sum+=digit*digit*digit;
            temp/=10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
