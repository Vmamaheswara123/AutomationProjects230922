package JavaNumaricPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,4,5};//1+2+4+5 = 
		int sum1 = 0;
		int sum2 = 0;
		
		int len1 = a.length;
		int dig1 = a[0];
		int ldig = a[len1-1];
		
		for(int i=0; i<a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements Array : " + sum1);
		
		
		
		for(int i=dig1; i<=ldig; i++) {
			sum2 = sum2+i;
		}
		System.out.println("Sum of Array :"+sum2);
		System.out.println("Missing Number is: "+(sum2-sum1));
	}

}
