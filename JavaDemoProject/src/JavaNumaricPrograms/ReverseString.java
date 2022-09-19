package JavaNumaricPrograms;

public class ReverseString {

	public static void main(String[] args) {
		reverseString01();
		reverseString02();
		reverseString03();
		reverseString04();

	}
	
	public static void reverseString01(){
		System.out.println("Logic 1");
		String str = "ABCD";
		String rev = "";
		
		int len = str.length();
		for(int i = len-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse String  : "+rev);
		
		if(rev.equals(str)) {
			System.out.println(rev+"is Palindrom String");
		}
		else{
			System.out.println(rev+"is not Palindrom String");
		}
	}
	
	public static void reverseString02(){
		System.out.println("Logic 2");
		String str = "ABCD";
		String rev = "";
		
		char[] a = str.toCharArray();
		int len = str.length();
		for(int i = len-1; i>=0; i--) {
			rev = rev+a[i];
		}
		
		System.out.println("Reverse String  : "+rev);
		
		if(rev.equals(str)) {
			System.out.println(rev+"is Palindrom String");
		}
		else{
			System.out.println(rev+"is not Palindrom String");
		}
	}

	public static void reverseString03(){
		System.out.println("Logic 3");
		String str = "ABCD";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse String  : "+rev);
		
		if(rev.equals(str)) {
			System.out.println(rev+"is Palindrom String");
		}
		else{
			System.out.println(rev+"is not Palindrom String");
		}
	}
	
	public static void reverseString04(){
		System.out.println("Logic 4");
		String str = "ABCD";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		StringBuilder rev = sb.reverse();
		
		System.out.println("Reverse String  : "+rev);
		
		if(rev.equals(str)) {
			System.out.println(rev+"is Palindrom String");
		}
		else{
			System.out.println(rev+"is not Palindrom String");
		}
	}
}
