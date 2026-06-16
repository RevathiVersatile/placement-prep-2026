public class Student    //main class
{
   String name;
   int age;
   int marks;

    Student(String name, int age, int marks)    //constructor
    {
    this.name=name;
    this.age=age;
    this.marks=marks;
    }
    void display()
    {
    
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("marks:"+marks);
    }

    public static void main(String[]args)
    {
        Student s1=new Student ("revathi",20,96);
        Student s2=new Student("sai",21,95);
        s1.display();
        s2.display();
    }
}
