package day3;

import java.util.Scanner;

public class thuchanh_returning {

	public static int returnLergerNumber(int x, int y)
	{
		if (x >y) return x;
		else return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("In ra so lon hon - Moi ban nhap so thu nhat: ");
		int a = scanner.nextInt();
		System.out.println("In ra so lon hon - Moi ban nhap so thu hai: ");
		int b = scanner.nextInt();
		int result = returnLergerNumber(a,b);
		System.out.println("So lon hon: " +result);

	}

}
