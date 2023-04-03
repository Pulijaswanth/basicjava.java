import java.util.*;
class Binary
{
   public static void main(String[] args)
   {
   int row,col,range;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of range");
   range=sc.nextInt();
   for(row=1;row<=range;row++)
    {
	 for(col=1;col<=row;col++)
    {
     if((row+col)%2==0)
	 {
		 System.out.print("0");
	 }
	 else
	 {
		 System.out.print("1");
	 }
    }
    System.out.println();
    }
   }
}
	