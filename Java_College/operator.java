import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        // System.out.println("Enter a string");
        // String s = sc.nextLine();
        // System.out.println(s);

        System.out.println("sum" + " " + (a+b));
        System.out.println("Subtract" + " " +(a-b));
        System.out.println("multiply" + " " + a*b);      //  ASSIGNMENT OPERATOR
        System.out.println("divide" + " " + a/b);
        System.out.println("modulous" + " " + a%b);
    
    }
    
}
