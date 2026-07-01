//METHOD 1

/*


import java.util.Scanner;

public class lcm{
    static int findlcm(int a, int b)
    {
        int res=Math.max(a,b);
        while (true) { 

            if(res%a==0 && res%b==0)
            {break;}
            res++;
            
        }
        return res;
    }
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value:");
    int a=sc.nextInt();
     System.out.println("enter b value:");
    int b=sc.nextInt();
    System.out.println("lcm:"+findlcm(a,b));

}
}



//time complexity:  O(a*b-max(a,b))


//METHOD 2


import java.util.Scanner;

public class lcm{
    static int findlcm(int a, int b)
    {
        return (a*b)/euclid_GCD(a,b);
    }

    static int euclid_GCD(int a, int b)
    {
        while(a!=b)
        {
            if(a>b)
            {a=a-b;}
            else{b=b-a;}
        }  
        return a;
        //or
        //return b;     
    }
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value:");
    int a=sc.nextInt();
     System.out.println("enter b value:");
    int b=sc.nextInt();
    System.out.println("lcm:"+findlcm(a,b));

}
}

*/

//time complexity:  O(log(min(a,b)))
