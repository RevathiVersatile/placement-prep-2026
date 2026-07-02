import java.util.Scanner;
public class bubblesort{

    static void bubble_sort(int [] arr)
    {
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                 
                //this is for ascending order
                //for descending order..
                // if(arr[j]<arr[j+1])

                {
                   int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //return arr;
        // no need to return when void use because pass by reference
    }

    public static void main(String[]args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int[] arr= new int[n];
            System.out.println("enter array elements:");
        for(int i=0;i<arr.length;i++)
            
            {
                arr[i]=sc.nextInt();
            }
    bubble_sort(arr);
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
    }
}
