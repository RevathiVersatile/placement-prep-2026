import java.util.Scanner;
public class areaperimeter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of the rectangle:");
        double length= sc.nextDouble();
         System.out.println("enter breadth of the rectangle:");
        double breadth= sc.nextDouble();
        double area= length*breadth;
        double perimeter= 2*(length+breadth);
        System.out.println("area of the rectangle:" +area);
        System.out.println("perimeter of the rectangle:" +perimeter);
}
}
