import java.util.*;
class rectangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER length");
        double l=sc.nextInt();
        System.out.println("ENTER breadth");
        double b=sc.nextInt();

        double A=l*b;
        System.out.println("Area is:"+A);
    }
    
}