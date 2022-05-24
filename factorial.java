import java.util.Scanner;
public class Main
{
   static void fact()
    {   int f=1;
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        long n=sc.nextInt();22
        for(int i=1;i<=n;i++)
        {
             f=f*i;
        }
        System.out.println("factorial="+f);
    }
    public static void main(String mohit[])
    {
     
        fact();
    }
}
