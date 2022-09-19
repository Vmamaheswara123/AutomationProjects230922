package JavaNumaricPrograms;

public class EqulityOfTwoArrays {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };

		int len1 = a1.length;
		int len2 = a2.length;

		boolean status = true;

		if (len1 == len2) {
			for (int i = 0; i < len1; i++) {

				if (a1[i] != a2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Two Arrays are Equle");
		} else {
			System.out.println("Two Arrays are not Equle");
		}
	}
}
