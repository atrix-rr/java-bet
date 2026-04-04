import java.util.*;
class Method1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 3 Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b || a>c)
        {
            System.out.println("A is Greater");
        }
        if(b>c || b>a)
        {
            System.out.println("B is Greater");
            
        }    
        }
}