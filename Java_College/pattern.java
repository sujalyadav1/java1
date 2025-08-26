import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            System.out.println("*");
        }
        if(num % 2 == 0){
            System.out.println("not arrow");
        }
        else{
            for(int i =(num/2)+1;i<num +2;i++){
                System.out.print(" * ");
            }
        }
    }
}

