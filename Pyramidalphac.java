import java.util.*;
class Pyramidalphac
{
	public static void main(String[]  args)
	{
		int i,j,num,space,star,k,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		space=num;
		star=1;
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=space-1;j++)
			{
				System.out.print(" ");
			}
			for(l=1;l<=i-1;l++)
			{
				System.out.print((char)(j+64));
			}
			for(k=1;k<=star;k++)
			{
				System.out.print((char)(j+64));
			}
			space--;
			star++;
			System.out.println();
		}
	}
}
