import java.util.Scanner;
public class second_largest
{
    static int sec_lar(int [] a)
    {
        int max1=a[0];
        int max2=a[1];
        if(a[0]>a[1])
        {
            max1=a[0];
            max2=a[1];
        }
        else 
        {
            max1=a[1];
            max2=a[0];
        }

        for(int i=2;i<a.length;i++)
        {
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }

            else if(a[i]>max2)
            {
                max2=a[i];
            }
        }
            return max2;
        }
    

public static void main(String[] args)
{
    //int [] a={20,12,3,88};
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size:");
    int size=sc.nextInt();
    int [] n=new int[size];
    if(size<2){
        System.out.println("Array must have at least two elements");
        return;
    }
    System.out.println("enter the elements:");
    for(int i=0;i<size;i++){
        n[i]=sc.nextInt();
    }
    System.out.println("Second largest: "+sec_lar(n));
    sc.close();

}
    }
