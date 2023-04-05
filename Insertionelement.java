import java.util.*;
class Insertionelement 
{
	public static void main(String[] args)
	{
		int arr[]=new int[20];
		int i,j,position,size,index,element;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=sc.nextInt();
		for(index=0;index<size;index++)
		{
			System.out.print("enter the values");
			arr[index]=sc.nextInt();
		}
		System.out.print("enter the element you want to enter");
	     element=sc.nextInt();
		 System.out.print("enter the position at which you want to enter the element");
		 position=sc.nextInt();
		 System.out.print(" values of array before insertion are");		 
	    for(index=0;index<size;index++)
		{
			System.out.print(arr[index]+" ");
		}
		size++;
		i=size-2;
		while(i>=position)
		{
		arr[i+1]=arr[i];
		i--;
		}
		arr[position]=element;
		System.out.println("\nvalues of the array after insertion are");
		for(index=0;index<size;index++)
		{
		System.out.print(arr[index]+" ");
		}
		
	}
}