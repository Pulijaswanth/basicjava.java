import java.util.*;
class GcdlcminOOP
{
	int gcd,lcm,num1,num2,temp1,temp2;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		num1=sc.nextInt();
		System.out.println("enter the second number");
		num2=sc.nextInt();
		temp1=num1;
		temp2=num2;
	}
	void calculate(GcdlcminOOP ob1 )
	{
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
	}
	void display()
	{
		System.out.println("the gcd of the numbers is "+gcd);
		System.out.println("the lcm of the numbers is"+lcm);
	}
	public static void main(String[] args)
	{
		GcdlcminOOP ob1=new GcdlcminOOP();//creation of object
		ob1.input();
		ob1.calculate(ob1);
		ob1.display();
		GcdlcminOOP ob2=new GcdlcminOOP();
		ob2.input();
		ob2.calculate(ob2);
		ob2.display();
	}
}
