package week1.day2homeassignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) 
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrsize=arr.length;
		System.out.println("size of the Arrar :"+arrsize);
		int count;
		for(int i=0;i<=arrsize-1;i++)
		{
			for(int j=i+1;j<=arrsize-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+" is Duplicate number");
				}
			}
		}
		
	}

}
