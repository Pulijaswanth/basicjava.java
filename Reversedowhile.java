import java.util.*;
class Reversedowhile
{
       public static void main(String[] args)
    {
     int num,digit,rev=0;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number");
	 num=sc.nextInt();
	 do
	 {
	 digit=num%10;
	 rev=rev*10+digit;
	 num=num/10;
	 }
	 while(num!=0);
	 System.out.println("Reverse of the number is "+rev);
	}
}