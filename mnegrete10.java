/*
 *
 *
 *
 *
 */
import java.util.Scanner;


public class lab10
{

	public static void main(String[] args)
	{
	int radius = 0;
	int height = 0;
//get height and radius in the main class
	Scanner input = new Scanner(System.in);
	System.out.println("enter radius of cylinder");
	radius = input.nextInt();
	System.out.println("enter height of cylinder");
	height = input.nextInt();

	System.out.println(volume(radius,height));
	

	}
	static double volume(int radius,int height)
	{

	double volume = Math.PI * radius * radius * height;
	return volume;

	}


}
