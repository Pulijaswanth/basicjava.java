import java.util.*;
class Factorialdowhile
{
      public static void main(String[] args)
	  {
	   int no,fact=1,temp;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number");
	   no=sc.nextInt();
	   temp=no;
	   do
	   {
	   fact=fact*no;
	   no--;
	   }
	   while(no!=0);
	   System.out.println("Factorial of the number is "+fact);
	   }
}