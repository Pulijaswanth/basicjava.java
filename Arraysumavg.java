import java.util.*;
class Arraysumavg
{
	public static void main(String[] args)
	{
		int arr[]=new int[20];
		int size,index,sum=0,average;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=sc.nextInt();
		for(index=0;index<size;index++)
		{
			System.out.println("enter the value");
			arr[index]=sc.nextInt();
		}
		System.out.println("values of the array are ");
		for(index=0;index<size;index++)
		{
			System.out.println(arr[index]);
		}
		for(index=0;index<size;index++)
		{
		sum=sum+arr[index];	
		}
		System.out.println("sum of the array is "+sum);
		average=sum/size;
		System.out.println("the averga of the number is "+average);
	}
}
