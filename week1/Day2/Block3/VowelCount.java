public class VowelCount
{
    public static void main(String[] args) 
    {
        String s = "hello";
        int c=0;
        for( int i=0;i<s.length();i++)
      //  int c=0;
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                
                c++;
            }
            
        }
        System.out.println("count" +c);
    }
}
