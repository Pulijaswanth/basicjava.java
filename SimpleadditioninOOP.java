import java.util.*;
class SimpleadditioninOOP
{
	int num1,num2,sum=0;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		num1=sc.nextInt();
		System.out.println("enter the second number");
		num2=sc.nextInt();
	}
	void calculate(SimpleadditioninOOP ob1)
	{
		sum=num1+num2;
	}
	void display()
	{
		System.out.println("The sum of the both the number are "+sum);
	}
	public static void main(String[] args)
	{
		SimpleadditioninOOP ob1=new SimpleadditioninOOP();//creation of object
		ob1.input();
		ob1.calculate(ob1);
		ob1.display();
	}
}