import java.util.*;
class Radius
{
     public static void main(String[] args)
{
     float side1,side2;
	 double area,radius;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter one side of the rectangle");
	 side1=sc.nextFloat();
	 System.out.println("enter the second side of the rectangle");
	 side2=sc.nextFloat();
	 area=side1*side2;
	 radius=Math.sqrt(area/3.14);
	 System.out.println("radius is " +radius);
}	 
}
