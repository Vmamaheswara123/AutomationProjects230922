package praticeClass;

public class JavaBasics {

	public static void main(String[] args) {
		
		JavaBasics jb = new JavaBasics();
		
		jb.catchTheLowerOrUpperCharInString();
		jb.returnOfString();
		String name = jb.returnOfString();
		System.out.println(name);
			
	}
	
	public String returnOfString() {
		String name = "Umamaheswara reddy";
		System.out.println("Pittu Umamahesara reddy");
		return name;
	}
	
	public void catchTheLowerOrUpperCharInString() {

		String str = "Pittu Umamaheswara Reddy";
		String rev = "";
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
		System.out.println();
	}

}
