import java.util.Scanner;
public class sumofdigits
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int r,s=0;
        System.out.println("enter number:");
        int n=sc.nextInt();
        System.out.println("original number:"+n);
        System.out.println("reverse number:");
        while(n>0)
        {
            r=n%10;
           s=s+r;
            n/=10;  
        }  
        System.out.println(s) ;

    }
}
