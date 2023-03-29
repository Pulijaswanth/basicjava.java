//gcd and lcm
import java.util.*;
class Gcdlcm
{
     public static void main(String[] args)
	{
      int num1,num2,gcd,lcm,temp1,temp2;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter num1");
	  num1=sc.nextInt();
	  System.out.println("Enter num2");
	  num2=sc.nextInt();
	  temp1=num1;
	  temp2=num2;
      while (num1!=num2)
      {
        if(num1>num2)
        {
		num1=num1-num2;
		}		
		else
		{
		num2=num2-num1;
		}
	  }
		gcd=num1;
		lcm=(temp1*temp2)/gcd;
		System.out.println("the lcm is "+lcm);
		System.out.println("the gcd is "+gcd);
	}
	
}
	