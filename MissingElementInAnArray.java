package week1.day2homeassignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		//Below for loop is to print the After sort array elements
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		//Below for loop is to print the MissingElement in Array
		for(int i=1;i<=arr.length-1;i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println("Missing element in Array is : "+i);
				break;
				
				
			}
			
		}
		
		

	}

}
