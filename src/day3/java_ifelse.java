package day3;

import java.util.Scanner;//scanner để nhập mảng hoặc java.util.*

public class java_ifelse {

	public static String result;
	public static void insolon(double a, double b)
	{
		result = (a>b) ? "So lon hon la: " +a : "So be hon la: " +b;
		System.out.println(result);
	}
	public static void chanle(int number)
	{
		result = (number %2 == 0)? "So vua nhap la so chan" : "So vua nhap la so le" ;
		System.out.println(result);
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("In ra so lon hon - Moi ban nhap so thu nhat: ");
		double a = scanner.nextDouble();
		System.out.println("In ra so lon hon - Moi ban nhap so thu hai: ");
		double b = scanner.nextDouble();
		insolon(a,b);
		System.out.println("kiem tra so chan le - Moi ban nhap so kiem tra:");
		int number = scanner.nextInt();
		chanle(number);
	}
}
