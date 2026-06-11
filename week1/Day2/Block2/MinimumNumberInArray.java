import java.util.Scanner;
public class MinimumNumberInArray
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int [5];
        System.out.println("enter 5 no.s:");
        
        for(int i=0;i<5;i++)
        {
            arr[i]= sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
System.out.println("minimum number:"+min);

    }
}
