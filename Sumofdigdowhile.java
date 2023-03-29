import java.util.*;
class Sumofdigdowhile
{
        public static void main(String[] args)
	{
        int num,sum=0,digit;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        num=sc.nextInt();
        do
        {
        digit=num%10;
        sum=sum+digit;
        num=num/10;
        }
		while(num!=0);
        System.out.println("sum of the digits is "+sum);
	}
}