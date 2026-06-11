import java.util.Scanner;
public class NthMultiplication
{
    public static void main(String[] args)
    {
        System.out.println("enter the number:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n +"th multiplication");
        int r;
        for(int i=1;i<=10;i++)
        {
            r=n*i;
            System.out.println(n +"x" +i +"=" +r);
        }
        
    }
}
