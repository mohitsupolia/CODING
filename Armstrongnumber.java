import java.util.Scanner;
public class Main
{
    void armstrong(int n)
    {
        int s=0,a,r;
        a=n;
       while(n!=0)
        {
            r=n%10;
            s=s+r*r*r;
            n=n/10;
        }
        if(a==s)
        System.out.println( "Armstrong number.");
        else
        System.out.println("not armstrong number.");
    }
    public static void main(String mohit[])
    {
        int n;
        System.out.println("enter the value of Armstrong number:--");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Main m=new Main();
        m.armstrong(n);
    }
}
