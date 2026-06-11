import java.util.Scanner;
public class AverageOfArray
{
    public static void main(String[] args) 
    {
       
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("enter 5 numbers:");
        for(int i=0;i<5;i++)
        {
            arr[i]= sc.nextInt();
        }
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        
        {
          
            sum=sum+arr[i];
        }
        double avg= (double)sum/5;
        System.out.println("average"+avg);

    }
}
