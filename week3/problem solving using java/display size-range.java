
//datatypes
//byte,int,short,long
//double,float
//char,string


public class display_size
{
    public static void main(String[]args)

    //byte-wrong,byte-correct
    //int,Int,integer-wrong & Integer-correct
    //long-wrong,Long-correct
    //double-wrong,Double-correct
    //float-wrong,Float-correct
    //char,character-wrong,Character-correct

    {
        System.out.println("byte size:" + Byte.SIZE + " byte min value:" + Byte.MIN_VALUE + " byte max value:" + Byte.MAX_VALUE);
        System.out.println("short size:" + Short.SIZE + " short min value:" + Short.MIN_VALUE + " Short max value:" + Short.MAX_VALUE);
        System.out.println("integer size:" + Integer.SIZE + " Integer min value:" + Integer.MIN_VALUE + " Integer max value:" + Integer.MAX_VALUE);
        System.out.println("long size:" + Long.SIZE + " Long min value:" + Long.MIN_VALUE + " Long max value:" + Long.MAX_VALUE);
        System.out.println("Double size:" + Double.SIZE + " Double min value:" + Double.MIN_VALUE + " Double max value:" + Double.MAX_VALUE);
        System.out.println("Float size:" + Float.SIZE + " Float min value:" + Float.MIN_VALUE + " Float max value:" + Float.MAX_VALUE);
        System.out.println("Character size:" + Character.SIZE + " Character min value:" + Character.MIN_VALUE + " Character max value:" + Character.MAX_VALUE);
        System.out.println("String has no SIZE, MIN_VALUE, or MAX_VALUE fields.");





    }
}
