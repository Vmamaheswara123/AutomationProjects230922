package JavaNumaricPrograms;

public class EvenAndOddNumberFindInArray {

	public static void main(String[] args) {

		int a[] = { 2, 4, 5, 3, 8, 7 };

		/*
		 * int len = a.length;
		 * 
		 * System.out.println("Even Numbers: "); for (int i = 0; i <= len - 1; i++) { if
		 * (a[i] % 2 == 0) { System.out.println(a[i]); }
		 * 
		 * } System.out.println("Odd Number: "); for (int i = 0; i <= len - 1; i++) { if
		 * (a[i] % 2 != 0) { System.out.println(a[i]); } }
		 */

		System.out.println("Even Numbers: ");
		for (int valve : a) {
			if (valve % 2 == 0)
				System.out.println(valve);
		}
		System.out.println("Odd Numbers: ");
		for (int valve : a) {
			if (valve % 2 != 0)
				System.out.println(valve);
		}
	}
}
