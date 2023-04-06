import java.util.*;
class ComplexAddition
{
	int real,img;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the real value");
		real=sc.nextInt();
		System.out.println("enter the imaginary value");
		img=sc.nextInt();
	}
	void add(ComplexAddition ob1,ComplexAddition ob2)
	{
		real=ob1.real+ob2.real;
		img=ob1.img+ob2.img;
	}
	void display()
	{
		System.out.println("sum is"+real+"+i"+img);
	}
	public static void main(String[] args)
	{
		ComplexAddition ob1=new ComplexAddition();
		ComplexAddition ob2=new ComplexAddition();
		ComplexAddition ob3=new ComplexAddition();		
		System.out.println("first object input");
		ob1.input();
		System.out.println("second object input");
		ob2.input();
		ob3.add(ob1,ob2);
		ob3.display();
	}
}