import java.util.*;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System .in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int avg=(num1+num2)/2;
        System.out.println("Average is:"+avg);
    }
}