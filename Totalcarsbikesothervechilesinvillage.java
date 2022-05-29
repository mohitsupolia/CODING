import java.util.Scanner;
public class Main
{
    void total(int cars,int bikes)
    {
        int vechiles;
        vechiles=cars+bikes;
        System.out.println("total personal vechiles="+vechiles);
        int othervechiles=cars-bikes;
        System.out.println("other vechiles remaining="+othervechiles);
    }
    public static void main(String Supolia[])
    {
       int cars,bikes;
        System.out.println("enter the cars in village:");
        Scanner sc=new Scanner(System.in);
        cars=sc.nextInt();
        System.out.println("enter the bikes in village:");
        bikes=sc.nextInt();
        Main m=new Main();
        m.total(cars,bikes);
    }
}
