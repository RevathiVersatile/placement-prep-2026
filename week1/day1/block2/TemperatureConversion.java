import java.util.Scanner;
public class TemperatureConversion
{
    public static double ctof(double c) {
        double f = (9.0/5.0*c)+32;
        return f;
    }
    public static double ftoc(double f) {
        double c = (5.0/9.0)*(f - 32);
        return c;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in celsius:");
        double c = sc.nextDouble();
        double f = ctof(c);
        System.out.println("temperature in fahrenheit:" +f);
        
        System.out.println("enter temperature in fahrenheit:");
        double f1 = sc.nextDouble();
        double c1 = ftoc(f1);
        System.out.println("temperature in celsius:" +c1);
    }
}
