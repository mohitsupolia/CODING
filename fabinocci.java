import java.util.Scanner;
public class Main
{
 static Scanner sc=new Scanner(System.in);
 static void fabi(int b)
 {
     int x=0,y=1,z;
     for(int i=0;i<=b;i++)
     {
         System.out.println(x);
         z=x+y;
         x=y;
         y=z;
     }
     
 }
 public static void main(String mohit[])
 {
     int n;
     System.out.println("Enter the number");
      n=sc.nextInt();
     fabi(n);
 }
}
