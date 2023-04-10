//star
import java.util.*;
class Pattern1
{
	public static void main(String[] arg)
	{
		int star,line,space,star2;
		Scanner sc=new Scanner(System.in);
		line=sc.nextInt();
		space=line;
		star=1;
		
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=space-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i-1;l++)
			{
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		}
	}
}