//METHOD 1- BRUTE FORCE

//gcd - greatest common divisor or
//hcf- highest common factor both are same
/* algorithm:
1.find minimum of numbers
2.use for loop start from min to 1
3.inside loop check if (a%i==0 && b%i==0) */

/*

import java.util.Scanner;
public class  gcd
{
    static int GCD(int a, int b)
    {
        int min=0;
        if(a<b)
        min=a;
        else
        min=b;
    

    for(int i=min;i>=1;i--)
    {
        if(a%i==0 && b%i==0)
        {
            return i;
        }        
    }
return 1;
}

public static void main(String [] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a value:");
    int a=sc.nextInt();
    System.out.println("enter b value:");
    int b=sc.nextInt();
    System.out.println("gcd/hcf:");
    System.out.println("gcd of the numbers:"+GCD(a,b));
    }
}


//OUTPUT:
//enter a value:
//20
//enter b value:
//15
//gcd of the numbers:5
//time compplexity:    O(min(a,b))



//METHOD 2- EUCLID ALGORITM

//ALGORITHM:
//find the largest
//find difference between the numbers
//replace the big number with difference
//repleat (a!=b)


import java.util.Scanner;
public class  gcd
{
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


public static void main(String [] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a value:");
    int a=sc.nextInt();
    System.out.println("enter b value:");
    int b=sc.nextInt();
    System.out.println("gcd/hcf:");
    System.out.println("gcd of the numbers:"+euclid_GCD(a,b));
    }
}

//time complexity:    O(max(a,b))




//METHOD 3- OPTIMISED EUCLID ALGORITM

//ALGORITHM:
//find the largest
//find modulo division "%" between the numbers
//replace the big number with difference
//repleat (a!=0 && b!=0)


import java.util.Scanner;
public class  gcd
{
    static int optimised_euclid_GCD(int a, int b)
    {
        while(a!=0 && b!=0)
        {
            if(a>b)
            {a=a%b;}
            else{b=b%a;}
        }  
        if(a!=0)
        return a;
        else return b;
           
    }


public static void main(String [] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a value:");
    int a=sc.nextInt();
    System.out.println("enter b value:");
    int b=sc.nextInt();
    System.out.println("gcd/hcf:");
    System.out.println("gcd of the numbers:"+optimised_euclid_GCD(a,b));
    }
}

//time complexity:      O(log(min(a,b)))

*/
