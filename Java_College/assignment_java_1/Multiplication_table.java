package assignment_java_1;
import java.util.*;

public class Multiplication_table{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("the multiplication table of "+n+" is :");
        for(int i=1;i<=10;i++){
            int table = n*i;
            // System.out.print.ln("the multiplication table of "+n+" is :")
            System.out.println(table);

        }
    }
}
