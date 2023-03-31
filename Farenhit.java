//Farenhit to celcius
import java.util.*;
class Farenhit
{
    public static void main(String[] args)
{
    float a,celcius;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of farenhit");
	a=sc.nextInt();
	celcius=((a-32)*5)/9;
	System.out.println("the celcius is "+celcius);
}
}
	
	