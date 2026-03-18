import java.util.Scanner;
class cubeofdigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three digit num");
        int n=sc.nextInt();
        System.out.println("Enter hundredth digit");
        int a=n/100;
        System.out.println("Enter tenth digit");
        int b=(n/10)%10;
        System.out.println("Enter ones digit");
        int c=n%10;
        int H=a*a*a;
        int T=b*b*b;
        int O=c*c*c;

        System.out.println("CUBE of hundredth:"+H);
        System.out.println("CUBE of tenth digit:"+T);
        System.out.println("CUBE of ones digit:"+O);
        
    }
}

