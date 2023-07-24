package week1.day2homeassignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,4,7,8,2,9};
		
		int arr1length=arr1.length;
		int arr2length=arr2.length;
		
		System.out.println("First array size :"+arr1length);//print the 1st array size
		System.out.println("Second array size :"+arr2length);//print the 2nd array size
		//Print the Intersection values
		for(int i=0;i<=arr1length-1;i++)
		{
			for(int j=0;j<=arr2length-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
		

	}

}
