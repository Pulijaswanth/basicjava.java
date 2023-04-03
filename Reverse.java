import java.util.*;
class Reverse
{
       public static void main(String[] args)
    {
     int num,digit,rev=0;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number");
	 num=sc.nextInt();
	 while(num!=0)
	 {
	 digit=num%10;
	 rev=rev*10+digit;
	 num=num/10;
	 }
	 System.out.println("Reverse of the number is "+rev);
	}
}
	