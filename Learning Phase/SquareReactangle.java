import java.util.*;
class SquareReactangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Length and Breadth");
        int L=sc.nextInt();
        int B=sc.nextInt();

        if(L==B)
        {
            System.out.println("Square");
        }
        else
        {
            System.out.println("Rectangle");
        }
        
    }
}