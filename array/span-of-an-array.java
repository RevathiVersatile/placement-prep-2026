//max-min of an array---->span of an array

//METHOD 1----> creating different methods for max,min

import java.util.Scanner;
public class spanofanarray
{
    static int max(int []arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max= arr[i];
        }
return max;
    }

    static int min(int []arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            min= arr[i];
        }
return min;
    }

    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of anarray:");
      int n=sc.nextInt();
      System.out.println("enter the array elements:");
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
      {
         arr[i]=sc.nextInt();
      }

        int span= max(arr)-min(arr);
        System.out.println(span);
    }
}


//METHOD 2---->single method

/*

import java.util.Scanner;
public class spanofanarray{
    static int spanofarray(int []arr)
    {
            int max=arr[0];
            int min=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>max)
                {max=arr[i];}
            
            if(arr[i]<min)
            {min=arr[i];}
            }
            return max-min;
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

            System.out.println(spanofarray(arr));
               

        }
    }

    */
