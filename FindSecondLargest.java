package week1.day2homeassignments;

public class FindSecondLargest {

	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7};
		int temp=0;
		//Below logic is to Sort the Array
		for(int i=0;i<=data.length-1;i++)
		{
			for(int j=i+1;j<=data.length-1;j++)
			{
				if(data[j]<data[i])
				{
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		//below for loop is to print the array elements after sorting
		System.out.println("After ascending the Array");
		for(int i=0;i<=data.length-1;i++)
		{
			System.out.println(data[i]);
		}
		int arrsize=data.length;
		System.out.println("size of the Array : "+arrsize);
		
		System.out.println("Second Largest Number from the given Array : "+data[arrsize-2]);//print the 2nd largent number in the array

	}

}
