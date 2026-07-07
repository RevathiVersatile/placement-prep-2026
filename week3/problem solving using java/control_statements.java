/*
public class control_statements
{
    public static void main(String[]args)
    {
        if (true)
            System.out.println("hello");
        System.out.println("welcome");

        //for statements no {} need but for declaration theu are need 
        //if(true)
        //{
      //  int x=10;
        //System.out.println(x);}
    }
}



//even or odd- if - else

import java.util.Scanner;
public class control_statements{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");

    }
}
}


//nested if
//greater among the numbers
import java.util.Scanner;
public class control_statements{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        System.out.println("enter c value");
        int c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+"is greater than"+b +"and"+c);
            }
            else
            {
                  System.out.println(c+"is greater than"+a+ "and"+b);
            }
        }
        else
        {
            if(b>c)
            {
                  System.out.println(b+"is greater than"+c+"and"+a);
            }
            else
            {
                  System.out.println(c+"is greater than"+b+"and"+a);
            }
        }


    }
}


//if elseif ladder

import java.util.Scanner;
public class control_statements{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter marks:");
            int marks=sc.nextInt();

            if(marks<=100)
            {
                if(marks>=80 && marks<=100)
                {
                    System.out.println("topper");
                }
                else if(marks>=60 && marks<80)
                {
                    System.out.println("1st class");
                }
                else if(marks>=50 && marks<60)
                {
                    System.out.println("2st class");
                }
                else if(marks>40 && marks<50)
                {
                    System.out.println("3st class");
                }
                else
                {
                    System.out.println("fail");
                }
            }
            else
            {
                    System.out.println("invalid marks");
            }
        }
    }
}

*/

//switch types---1.swirch case  2.switch fall through
//in switch case -->break is used for break that case
//in switch fall through--->there ie no break therefore all statements will execute
//calculator programme

import java.util.Scanner;
public class control_statements
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a value:");
            int a=sc.nextInt();
            System.out.println("enter b value:");
            int b=sc.nextInt();
            
           // if(n==1 || n==2 || n==3 || n==4)---wrong
            while(true) //if while not used programme execute for one time only it wont iterate evenwithout this programme will execute
            {
                System.out.println("1-add\n2-sub\n3-mul\n4-div\n5-exit\n");
            System.out.println("enter number:");
            int n=sc.nextInt();
            
                switch(n)
                {
                        case 1:
                        {
                            System.out.println(a+b);
                            break;
                        }
                         case 2:
                        {
                            System.out.println(a-b);
                             break;
                        }
                         case 3:
                        {
                            System.out.println(a*b);
                             break;
                        }
                         case 4:
                        {
                            System.out.println(a/b);
                             break;
                        }
                        case 5:
                            {
                                System.out.println("thanks for using");
                                System.exit(0);  //it is for forcefully stopping the loop for not to iterate the loop
                            }
                        default:
                            {
                                System.out.println("please select valid option");
                            }
                        
            }
                }                                     
        }
    }
}
