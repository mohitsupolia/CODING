package InputOutput;

import java.util.Scanner;

public class KadansAlgo
{
	static int maxAddSubArray(int arr[])
	{
		int maxSum=0;
		int curr=0;
		for(int i=0;i<arr.length;i++)
		{
			curr=curr+arr[i];
			if(curr>maxSum)
			{
				maxSum=curr;
			}
			if(curr<0)
			{
				curr=0;
			}
			
		}
		return maxSum;
	}
	
	public static void main(String[] args) 
	{
		int arr[]=new int[] {5,-1,-3,5,9};

		System.out.println(maxAddSubArray(arr));
		}

}
