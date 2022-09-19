package JavaNumaricPrograms;

public class CountEvenAndOddNum {

	public static void main(String[] args) {
		int num = 123456543;
		int even_Count = 0;
		int odd_Count = 0;
		
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				even_Count++;
			}
			else{
				odd_Count++;
			}
			num = num/10;
		}

		System.out.println("Even Number count:  "+ even_Count);
		System.out.println("Even Number count:  "+ odd_Count);
	}

}
