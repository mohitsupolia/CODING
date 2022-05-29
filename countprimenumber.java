
   
import java.util.Scanner;
public class Main
{
void prime(int n)
{
    int i,j;
    for(i=2;i<=n;i++)
    {
        for(j=2;j<=i;j++)
        {
           if(i%j==0)
            break;
        }
        if(i==j)
        {
        count++;
        System.out.println("prime number="+j);
        }
    }
    System.out.println("prime number="+count);
}
public static void main(String mohit[])
{
    int n;
    System.out.println("enter the number:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    Main m=new Main();
    m.prime(n);
}
}
