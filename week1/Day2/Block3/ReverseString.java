public class ReverseString
{
    public static void main( String[] args)
    {
        String s= "hello";
        for(int i=s.length()-1;i>=0;i--)
     {
                char n= s.charAt(i);
           
            System.out.print(n);
    }
    }
}
