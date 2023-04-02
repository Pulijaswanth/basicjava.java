import java.util.*;
class Copyarray
{
	public static void main(String[] args)
	{
		int arr[]=new int[20];
		int arr1[]=new int[20];
		int size,index,largest;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=sc.nextInt();
		for(index=0;index<size;index++)
		{
			System.out.print("enter the values in the arrays");
			arr[index]=sc.nextInt();
		}
		System.out.println("the values of the array are ");
		for(index=0;index<size;index++)
		{
			System.out.print(arr[index]);
		}
		for(index=0;index<size;index++)
		{
			arr1[index]=arr[index];
		}
		System.out.print(arr1[index]+" ");
	}
}
