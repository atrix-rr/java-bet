import java.util.*;
class Neon 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number between 0-9");
        int num=sc.nextInt();

        double S=Math.pow(num,2);

        double First=S/10;
        double Second=S%10;

        double Sum=First+Second;
        
        if(Sum==num)
        {
            System.out.println("Neon No.");
        }
        else
        {
            System.out.println("Not");
        }
    }
}