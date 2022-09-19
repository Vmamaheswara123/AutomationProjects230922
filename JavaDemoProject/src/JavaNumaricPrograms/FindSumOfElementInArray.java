package JavaNumaricPrograms;

public class FindSumOfElementInArray {


	public static void main(String[] args) {
		
		int a[] = {5,7,9,2,4};
		
		int sum = 0;
		int len = a.length;
		
		for(int i=0; i<=len-1; i++) {
			sum = sum+a[i]; // 5+7+9+2+4
		}
		
		//Enhanced for loop
		/*for(int value:a) {
			sum = sum+value;
		}*/
		
		System.out.println("Sum of Array is: "+ sum);

	}

}
