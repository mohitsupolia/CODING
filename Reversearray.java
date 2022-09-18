package Element;

import java.util.Scanner;

public class Reverse 
{
	int last;
	void into()
	{
				int arr[]=new int[5];
		System.out.println("Enter the value of array:-");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
		int x=sc.nextInt();
		arr[i]=x;
		}
		for(int i=arr.length-1;i>=0;i--)
			
		{
			System.out.println("Reverse the array="+arr[i]);
		}
		
	}

	public static void main(String[] args)
	{
		Reverse re=new Reverse();
		re.into();
	}

}
