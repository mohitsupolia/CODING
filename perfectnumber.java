import java.util.Scanner;
public class Main
{
    void perfect(int n)
    {
        int i,s=0;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        if(n==s)
        System.out.println("perfect number.");
        else
        System.out.println("not perfect number.");
    }
    public static void main(String mohit[])
    {
        int n;
        System.out.println("enter the value of perfect number:--");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Main m=new Main();
        m.perfect(n);
    }
}
