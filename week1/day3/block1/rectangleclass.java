public class Rectangleclass
{
double length;
double breadth;

    Rectangleclass(double length, double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    double area()
    {
        return length*breadth;
    }

    double perimeter()
    {
         return 2*(length+breadth);
    }

    void display()
    {
        System.out.println("area:"+area());
        System.out.println("perimeter:"+perimeter());
    }

    public static void main(String[]args)
    {
        Rectangleclass r1= new Rectangleclass(10,4);
         Rectangleclass r2= new Rectangleclass(2,4);
          Rectangleclass r3= new Rectangleclass(12,2);
        r1.display();
        r2.display();
        r3.display();
    }

}
