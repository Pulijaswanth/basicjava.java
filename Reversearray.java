import java.util.*;
class Reversearray
{
	public static void main(String[] args)
	{
		int arr[]=new int[20];
		int arr1[]=new int[20];
		int size,index,largest,j=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=sc.nextInt();
		for(index=0;index<size;index++)
		{
			System.out.print("enter the values");
			arr[index]=sc.nextInt();
		}
		System.out.print(arr[index]+" ");
	    for(index=0;index<size;index++)
		{
			System.out.print(arr[index]+" ");
		}
		for(index=size-1;index>=0;index--)
		{
			arr1[j]=arr[index];
			j++;
		}
		System.out.println("\nvalues of reverse array are ");
		for(index=0;index<size;index++)
		{
			System.out.print(arr1[index]+" ");
		}
	}
}
