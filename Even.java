import java.util.*;
class Even
{
	public static void main(String[] args)
	{
		int num,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{ 
			if(i%2==0)
			{
				System.out.print(+i);
				System.out.print(" ");
			}
		}
	}
}
