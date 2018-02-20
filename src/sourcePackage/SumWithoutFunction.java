package sourcePackage;
import java.util.Scanner;
//import  static java.lang.Math.*;
class SumWithoutFunction{
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println(" Enter two numbers ");
		int a= scanner.nextInt();
		scanner.nextLine();
		int b=scanner.nextInt();
		//int c= addExact(a,b);
		int d= a+b;
		int e= a-(-b);//answer
		System.out.println(" sum of two numbers with + operator is "+ d +" and without operator "+e);
	}
}