import java.util.Scanner;
public class CalculatorUsingMethods {
    static int a, b;

    public static int sum() {
        int result = a + b;
        System.out.println("sum:" + result);
        return result;
    }

    public static int sub() {
        int result = a - b;
        System.out.println("difference:" + result);
        return result;
    }

    public static int mul() {
        int result = a * b;
        System.out.println("product:" + result);
        return result;
    }

    public static int div() {
        int result = a / b;
        System.out.println("quotient:" + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        sum();
        sub();
        mul();
        div();
        sc.close();
    }
}
