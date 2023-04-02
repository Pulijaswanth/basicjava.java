import java.util.*;
class Areaoftri
{
     public static void main(String[] args)
{
    double a,b,c,area,s;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first side of the triangle");
	a=sc.nextDouble();
	System.out.println("enter the second side of the triangle");
	b=sc.nextDouble();
	System.out.println("enter the three side of the triangle");
	c=sc.nextDouble();
	s=(a+b+c)/2;
	System.out.println("the value of s  is "+s);
	area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("area of the triangle is "+area);
}
}
	