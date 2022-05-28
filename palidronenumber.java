import java.util.Scanner;
public class Main
{
 
 
     void pali(int n)
     {
         int r,y=0,s,a;
         a=n;
         while (n!=0)
         {
           r=n%10;
           y=10*y+r;
           n=n/10;
         }
         if(a==y)
         System.out.println("palidrone number");
          else
         System.out.println("not palidrone number");
     }

    
        
        public static void main(String mohit[])
        {
        int n;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Main m=new Main();
        m.pali(n);
    }
}
