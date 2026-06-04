import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String []args)
    {
        System.out.println("enter two numbers:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println("sum:" +sum);
        System.out.println("difference:" +(a-b));
        System.out.println("product:" +(a*b));
        System.out.println("quotient:" +(a/b));
        System.out.println("remainder:" +(a%b));
        
    }
}
