import java.util.*;
class Largest
{
     public static void main(String[] args)
{
      int num1,num2,num3,large,bigest;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter first number");
	  num1=sc.nextInt();
	  System.out.println("enter second number");
	  num2=sc.nextInt();
	  System.out.println("enter third number");
      num3=sc.nextInt();
	  large=(num1>num2)?num1:num2;
	  bigest=(large>num3)?large:num3;
	  System.out.println("the largest number is "+bigest);
}
}
	  