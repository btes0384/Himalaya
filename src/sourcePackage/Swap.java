package sourcePackage;
import java.util.Scanner;
class Swap{
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String args[]){
		Swap s= new Swap();
		int a=0,b=0;
		s.swapping(a,b);
	}
	private void swapping(int m,int n){
		System.out.println(" enter a number m and n");
		n=scanner.nextInt();
		scanner.nextLine();
		m=scanner.nextInt();
		scanner.nextLine();
		System.out.println("a is "+m+" b is "+n+" before swapping");
		m=m^n;
		n=n^m;
		m=m^n;
		System.out.println(" a is "+m+" b is "+n+" after Swapping");
	}
}