import java.util.Scanner;
public class employee_details
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee name:");
        String name=sc.nextLine();
        System.out.println("enter employee Age:");
        int age=sc.nextInt();
        System.out.println("enter employee phone number:");
        long phone_number=sc.nextLong();
        System.out.println("gender-m or f:");
        char gender=sc.next().charAt(0);
        System.out.println("martial status:");
        boolean m=sc.nextBoolean();
        
        
        System.out.println("\n");
        System.out.println("name:" +name );
        System.out.println("age:" +age );
        System.out.println("phone_number:" +phone_number );
        System.out.println("gender:" +gender);
       

        if(m)
        {
            System.out.println("married");
            }
        else
        {
            System.out.println("not married");
        }
    }
}
