package JavaNumaricPrograms;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int rnd_num = rnd.nextInt(100);
		System.out.println("Random Number: "+ rnd_num);
		
		double rnd_dbl = rnd.nextDouble();
		System.out.println("Random Decimal: "+rnd_dbl);
		

	}

}
