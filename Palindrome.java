import java.util.*;
class Palindrome
{
       public static void main(String[] args)
    {
     int num,digit,rev=0,temp;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number");
	 num=sc.nextInt();
	 temp=num;
	 while(num!=0)
	  {
	 digit=num%10;
	 rev=rev*10+digit;
	 num=num/10;
	  }
	 System.out.println("Reverse of the number is "+rev);
	if(rev==temp)
	 {
	System.out.println(""+temp+" is a palindrome");
     }
	else
	 {
	System.out.println(""+temp+" is not a palindrome");
	 }
    }
}
	