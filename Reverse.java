import java.util.Scanner;
public class Reverse
{
     Scanner sc=new Scanner(System.in);
      void reverse()
    {
      int n,i,j=0,c;
      System.out.println("enter the values of array:");
      n=sc.nextInt();
      int []a=new int[n];
       int []b=new int[n];
      for(i=0;i<n;i++)
      a[i]=sc.nextInt();
      for(i=n-1;i>=0;i--)
      {
          b[j++]=a[i];
      }
      {
      for(j=0;j<n;j++)
      System.out.println(b[j]+" ");
      }
    
    }
    
    public static void main(String mohit[])
    {
        Main m=new Main();
       m.reverse();
    }
}
