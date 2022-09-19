package JavaNumaricPrograms;

import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int count = 0;
		
		if(num>0) {
			for(int i=1; i<=num; i++) {
				count = num%i;
				count++;
			}
				if(count==2) {
					System.out.println("Number is Prime Number");
				}
				else {
					System.out.println("Number is not Prime Number");
				}
			
		}

	}

}
