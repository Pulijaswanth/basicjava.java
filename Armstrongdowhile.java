import java.util.*;
class Armstrongdowhile
{
        public static void main(String[] args)
	{
        int num,digit,temp,count=0;
		double sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        num=sc.nextInt();
		temp=num;
		do
		{
		count++;
        num=num/10;
        }
		while(num!=0);
        num=temp;		
        do
        {
        digit=num%10;
        sum=sum+Math.pow(digit,count);
        num=num/10;
        }
		while(num!=0);
        System.out.println("sum of the digits is "+sum);
		if(sum==temp)
		{
		System.out.println("it is a armstrong number");
		}
		else
		{
		System.out.println("it is not an armstrong number");
		}
		
		
	}
}