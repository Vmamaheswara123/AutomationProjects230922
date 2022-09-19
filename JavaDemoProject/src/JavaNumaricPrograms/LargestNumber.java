package JavaNumaricPrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		largestNum01();
		largestNum02();
		largestNum03();

	}

	public static void largestNum03() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();

		System.out.println("Enter 3rd Number: ");
		int c = sc.nextInt();
		

		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);

		System.out.println(largest + " is a largest Number");
	}

	public static void largestNum02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();

		System.out.println("Enter 3rd Number: ");
		int c = sc.nextInt();

		int largest1 = a > b ? a : b;
		int largest2 = c > largest1 ? c : largest1;

		System.out.println(largest2 + " is a largest Number");

	}

	public static void largestNum01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();

		System.out.println("Enter 3rd Number: ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + "is a Largest Number");
		} else if (b > a && b > c) {
			System.out.println(b + "is a Largest Number");
		} else {
			System.out.println(c + "is a Largest Number");
		}
	}

}
