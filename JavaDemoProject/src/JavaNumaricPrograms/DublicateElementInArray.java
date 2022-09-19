package JavaNumaricPrograms;

public class DublicateElementInArray {

	public static void main(String[] args) {
		
		String a[] = {"java","C","C++","python","java"};
		int len = a.length;
		
		boolean status = false;
		for(int i=0; i<len; i++) 
		{
			for(int j=i+1; j<len; j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("Dublicate Value is : "+a[i]);
					status = true;
				}
			}
		}
		if(status == false) {
			System.out.println("Dublicate element is not found");	
		}
		
	}

}
