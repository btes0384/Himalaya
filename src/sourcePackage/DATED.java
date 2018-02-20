package sourcePackage;
import java.util.Scanner;
class DATED {
	private static Scanner scanner= new Scanner(System.in);
	public static void main(String args[]){
		System.out.println(" Enter the number of Days ");
		int days= scanner.nextInt();
		int remainingDays=days%30;
		int months = days/30;
		System.out.println(months+" Months  and "+remainingDays+" Days");
	}
}