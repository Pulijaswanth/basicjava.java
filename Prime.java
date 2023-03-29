import java.util.*;
class Prime
{
      public static void main(String[] args)
	{
      int num,value=1,count=0;
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      num=sc.nextInt();
	  while(value<=num)
	  {
	  if(num%value==0)
	  {
	  count++;
	  }
	  value++;
	  }
	  if(count==2)
	  {
	  System.out.println("the number is prime");
	  }
	  else
	  {
	  System.out.println("it is not a prime number");
	  }
	}
}
	
	  
	