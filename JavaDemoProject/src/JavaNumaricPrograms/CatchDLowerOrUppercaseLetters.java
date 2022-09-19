package JavaNumaricPrograms;

public class CatchDLowerOrUppercaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		
		String str = "Pittu Umamaheswara Reddy";
		//String[] splitStr = str.split(" ");
		int len = str.length();
		//System.out.println("String split with space : "+ splitStr[0]);

		for(int i=0; i<=len-1; i++) {
			char a = str.charAt(i);
			
			for( char b = 'a'; b<='z'; ++b) {
				
				if(a == b) {
					System.out.print(a);
				}
			}
		}

	}

}
