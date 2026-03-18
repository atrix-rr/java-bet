import java.util.*;
class triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER LENGHT");
        double L=sc.nextInt();
        System.out.println("ENTER BREADTH");
        double B=sc.nextInt();

        double A=0.5*L*B;
        System.out.println("Area is:"+A);
    }
}