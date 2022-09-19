package JavaNumaricPrograms;

public class MaxAndMinValueArray {

	public static void main(String[] args) {
		
		int a[] = {2,3,6,4,5,9};
		int max = a[0];
		int min = a[0];
		int len = a.length;
		
		for(int i=1; i<len; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value of Array: "+min);
		for(int j=1; j<len; j++) {
			if(a[j]>max) {
				max=a[j];
			}
		}
		System.out.println("Maximum value of Array: "+max);
		
		for(int val: a) {
			if(val<min) {
				min=val;
			}
		}
		System.out.println("Minimum value of Array: "+min);
		for(int val: a) {
			if(val>max) {
				max=val;
			}
		}
		System.out.println("Maximum value of Array: "+max);
	}

}
