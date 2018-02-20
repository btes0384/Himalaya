package sourcePackage;
import java.util.Scanner;
//import static java.lang.Math.PI;
class AOC{
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String args[]){
		System.out.println(" enter the Side of Square ");
		int a= scanner.nextInt();
		scanner.nextLine();
		AreaOfSquare(a);
		System.out.println(" enter the Radius of Circle ");
		float b= scanner.nextFloat();
		scanner.nextLine();
		Cicumference(b);
	}
	private static void AreaOfSquare(int side){
		int area= (int)Math.pow(side,2);
		System.out.println(" Area of Square is "+area);
	}
	private static void Cicumference(float radius){
		float circum=(float) (2*Math.PI*radius);
		System.out.println(" Circumference of Circle is "+circum);
	}
}