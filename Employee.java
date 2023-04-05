//to calculate the salary of the employee
import java.util.*;
class Employee
{
	String name,address;
	int id;
	float basic,gross,da,hra,ta,tax;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the id of the employee");
		id=sc.nextInt();
		System.out.println("enter the basic salary ");
		basic=sc.nextFloat();
		System.out.println("enter the address");
		address=sc.next();
	}
	void calculate()
	{
		da=basic*12/100;
		hra=basic*15/100;
		ta=basic*7/100;
		tax=basic*8/100;
		gross=basic+da+hra+ta-(tax);
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("id number ="+id);
		System.out.println("gross="+gross);
		System.out.println("address "+address);
	}
	public static void main(String[] args)
	{
		Employee emp1=new Employee();//object creation of class
		emp1.input();
		emp1.calculate();
		System.out.println("salary details of the employee");
		System.out.println("------------------------------");
		emp1.display();
		Employee emp2=new Employee();//object creation of class
		emp2.input();
		emp2.calculate();
		System.out.println("salary details of the employee ");
		System.out.println("--------------------------------");
		emp2.display();
	}
}
