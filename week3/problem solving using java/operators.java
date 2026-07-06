//increment and decrement operators
/*
public class operators
{
    public static void main(String[]args)
    {
        int a=10;
        int b=a++;
        int b1=++a;
        int c=a--;
        int c1=--a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(c);
        System.out.println(c1);
        
    
    }
}

*/
//int post decrement or increment different
//in pre decrement or increment both are same
//we can apply it for any premitive datatype except boolean 

//arithmatic operators--> + - * / % //


// formula i.e the output datatype is the max of all

// type--> max(int,type of a ,type of b)
    //  max(int,char,char)- int
     //  max(int,char,char)- int
     //  max(int,double,char)- double
     //  max(int,doublr,float)-double
     // //  max(int,int,double)- double
     //max(int,float,char)-float

/*
    public class operators{

public static void main(String[]args)
{
    int a=10;
    int b=10;
    int z=a+b;
    System.out.println(z);

    char c='c';
    char c1='a';
    int c2=c+c1;
    System.out.println(c2);

    float f1=23.3f;
    double d=23;
    double dd=a+b;
    System.out.println(dd);
}


    }
    

//relational operators
//we cant apply relational operation between the strings but canh aply for characters


//chaining operation can be occur in python not java--->(100<200<300)--->nestling of .....

 public class operators{

public static void main(String[]args)
{
     System.out.println(10>20);
      System.out.println('a'>'A');
       //System.out.println('hi'>'hlo');--->not work
        System.out.println('a'>94);
        // System.out.println(true>false); --> not work
}
 }


// concatenation

//atleast one string thrn output is string,'+' perform concateration
//if all inetger then addition

public class operators{
    public static void main(String[] args) {


       int x=10;
       int y=20;
       String z="hello" ;
       System.out.println(x+y+z);
        System.out.println(x+z+y);
         System.out.println(z+y+x);

    }
}



//equality operator

public class operators{
    public static void main(String[]args)
    {
        int a=10;
        int b=20;
        char c='c';
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println('a'=='b');
        System.out.println('a'==c);

    }
}

*/


//bitwise operator

public class operators{
    public static void  main (String[]args)
    {
        int a=10;
        int b=20;
        int c=-10;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(~c);
        System.out.println(a<<10);
        System.out.println(a>>10);
        
    }
}
