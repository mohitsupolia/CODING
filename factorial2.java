import java.util.Scanner;
public class Main
{

    static int fact()
    {  
        Scanner sc=new Scanner(System.in);
        int f=1;
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String mohit[])
    {
        int c;
    c=fact();
    System.out.println("factorial="+c);
    }
}
