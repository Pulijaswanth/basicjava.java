import java.util.*;
class Twodarray
{
	public static void main(String[] args)
	{
	   int arr[][]=new int[20][30];
	   int row,col,i,j;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the row of array");
	   row=sc.nextInt();
	   System.out.println("Enter the column of the array");
	   col=sc.nextInt();
	   for(i=0;i<row;i++)
	   {
	     for(j=0;j<col;j++)
		 {
			 System.out.print("enter the value");
			 arr[i][j]=sc.nextInt();
		 }
	   }
	   System.out.println("values of array are\n");
	   for(i=0;i<row;i++)
	   {
		   for(j=0;j<col;j++)
		   {
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
	   }
	}
}
