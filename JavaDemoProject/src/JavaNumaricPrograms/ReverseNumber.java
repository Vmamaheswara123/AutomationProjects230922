package JavaNumaricPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		reversNumber01();
		reversNumber02();
		reversNumber03();

	}

	public static void reversNumber01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:  ");
		int num = sc.nextInt();
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse Number  :" + rev);
		
		if(rev==num) {
			System.out.println(rev+" is palindrom Number");
		}
		else {
			System.out.println(rev+" is not palindrom Number");
		}

	}

	public static void reversNumber02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:  ");
		int num = sc.nextInt();
		// Logic2

		StringBuffer rev1;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev1 = sb.reverse();

		System.out.println("Reverse Number  :" + rev1);
		
		
		int rev = Integer.parseInt(rev1.toString());
		
		if(rev==num) {
			System.out.println(rev+" is palindrom Number");
		}
		else {
			System.out.println(rev+" is not palindrom Number");
		}

	}

	public static void reversNumber03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:  ");
		int num = sc.nextInt();
		// Logic3

		StringBuilder rev1;
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		rev1 = sbl.reverse();

		System.out.println("Reverse Number  :" + rev1);
		
		int rev = Integer.parseInt(rev1.toString());
		
		if(rev==num) {
			System.out.println(rev+" is palindrom Number");
		}
		else {
			System.out.println(rev+" is not palindrom Number");
		}
	}
}