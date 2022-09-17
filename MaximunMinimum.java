package Element;
import java.util.Scanner;
public class MaximunMinimum
{
	int position;
	void show()
	{
		
		System.out.println("Enter the size of array:-");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		position=size;
		int arr[]=new int[size];
		System.out.println("Enter the values of array:-");
		for(int j=0;j<position;j++) {
		int s=scanner.nextInt();
		arr[j]=s;
		}
		int max=arr[0];
		for(int i=0;i<position;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("maximun number is ="+max);
	}

	public static void main(String[] args)
	{
		MaximunMinimum ele=new MaximunMinimum();
		ele.show();

	}

}
