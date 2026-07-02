import java.util.Scanner;
public class selectionsort{
    static void selection_sort(int []arr)
    {
            for(int i=0;i<arr.length;i++)
            {
               int min_i=i;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]<arr[min_i])
                    {
                       min_i=j; 
                    }
                }
                int temp=arr[i];
                arr[i]=arr[min_i];
                arr[min_i]=temp;
            }
    }

    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value of n:");
            int n =sc.nextInt();
            int [] arr= new int[n];
            System.out.println("enter the array elements:");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }

            selection_sort(arr);
               for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        }
    }
