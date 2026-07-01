import java.util.Scanner;
public class second_smallest
{
    static int sec_lar(int [] a)
    {
        int min1=a[0];
        int min2=a[1];
        if(a[0]<a[1])
        {
            min1=a[0];
            min2=a[1];
        }
        else 
        {
            min1=a[1];
            min2=a[0];
        }

        for(int i=2;i<a.length;i++)
        {
            if(a[i]<min1)
            {
                min2=min1;
                min1=a[i];
            }

            else if(a[i]<min2)
            {
                min2=a[i];
            }
        }
            return min2;
        }
    

public static void main(String[] args)
{
    //int [] a={20,12,3,88};
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size:");
    int size=sc.nextInt();
    int [] a=new int[size];
    if(size<2){
        System.out.println("Array must have at least two elements");
        return;
    }
    System.out.println("enter the elements:");
    for(int i=0;i<size;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Second smallest: "+sec_lar(a));
    sc.close();

}
    }
