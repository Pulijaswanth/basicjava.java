//dmemo on class and object
import java.util.*;
class StudentResult
{
	String name;
	int roll;
	float mark[]=new float[50];
	int size,index;
	char grade;
	float avg;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the roll number");
		roll=sc.nextInt();
		System.out.println("enter the number of subjects");
		size=sc.nextInt();
		for(index=0;index<size;index++)
		{
			System.out.println("enter the marks");
			mark[index]=sc.nextFloat();
		}
	}
	void calculate()
	{
		float sum=0.0f;
		for(index=0;index<size;index++)
		{
			sum=sum+mark[index];
		}
		avg=sum/(size);
		if(avg>=90)
		{
			grade='o';
		}
		else if(avg>70 && avg<90)
		{
			grade='e';
		}
		else if(avg>50 && avg<70)
		{
			grade='a';
		}
		else
		{
			grade='b';
		}
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("Roll number ="+roll);
		System.out.println("Average mark ="+avg);
		System.out.println("grade is "+grade);
	}
	public static void main(String[] args)
	{
		StudentResult st1=new StudentResult();//object creation of class
		st1.input();
		st1.calculate();
		System.out.println("details of the first student");
		System.out.println("------------------------------");
		st1.display();
		StudentResult st2=new StudentResult();//object creation of class
		st2.input();
		st2.calculate();
		System.out.println("details of the second student ");
		System.out.println("--------------------------------");
		st2.display();
	}
}
