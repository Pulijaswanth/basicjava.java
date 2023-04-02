import java.util.*;
class Halfdia
{
   public static void main(String[] args)
   {
   int range,row,col;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the range");
   range=sc.nextInt();
   for(row=1;row<=range;row++)
   {
     for(col=1;col<=row;col++)
	 {
	  System.out.print((char)(col+64));
	  }
	  System.out.println();
	  }
	  for(row=range-1;row>=1;row--)
	  {
	  for(col=1;col<=row;col++)
	  {
		  System.out.print((char)(col+64));
	  }
	  System.out.println();
	}
   }
}
