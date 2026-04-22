import java.util.*;
class Method3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is Greatest");

            }
            else{
                System.out.println("C is Greatest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("B is Greatest");
            }
            else
            {
                System.out.println("C is Greatest");
            }
        }
    }
}
