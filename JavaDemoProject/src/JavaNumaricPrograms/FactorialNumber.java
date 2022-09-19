package JavaNumaricPrograms;

import java.util.Random;

public class FactorialNumber {

	public static void main(String[] args) {
		Random rnd = new Random();
		int num = rnd.nextInt(15);
		System.out.println("Number is : "+ num);
		long fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		
		//for(int i=num; i<=1; i--) {
		//	fact = fact*i;
		//}
		System.out.println("Factorial of Number is : "+ fact);
	}

}
