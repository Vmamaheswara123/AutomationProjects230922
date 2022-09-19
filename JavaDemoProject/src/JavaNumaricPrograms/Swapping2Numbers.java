package JavaNumaricPrograms;

public class Swapping2Numbers {

	public static void main(String[] args) {
		sawp1();
		sawp2();
		sawp3();
		sawp4();
		sawp5();

	}
		public static void sawp1() {
			System.out.println("Logic 1");
			int a = 10;
			int b = 20;
			System.out.println("Before swappig Numbers a,b Values  "+a+"  "+b);
			//Logic1
			
			int t = a;
			a=b;
			b=t;
			
			System.out.println("After swapping Numbers a,b values  "+a+"  "+b);

		}

		
		public static void sawp2() {
			System.out.println("Logic 2");
			int a = 10;
			int b = 20;
			System.out.println("Before swappig Numbers a,b Values  "+a+"  "+b);
			//Logic2
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("After swapping Numbers a,b values  "+a+"  "+b);

		}
		
		public static void sawp3() {
			System.out.println("Logic 3");
			int a = 10;
			int b = 20;
			System.out.println("Before swappig Numbers a,b Values  "+a+"  "+b);
			//Logic3
			a=a*b;
			b=a/b;
			a=a/b;
			System.out.println("After swapping Numbers a,b values  "+a+"  "+b);

		}
		
		public static void sawp4() {
			System.out.println("Logic 4");
			int a = 10;
			int b = 20;
			System.out.println("Before swappig Numbers a,b Values  "+a+"  "+b);
			//Logic4
			
			a=a^b;
			b=a^b;
			a=a^b;
			
			System.out.println("After swapping Numbers a,b values  "+a+"  "+b);

		}
		
		public static void sawp5() {
			System.out.println("Logic 5");
			int a = 10;
			int b = 20;
			System.out.println("Before swappig Numbers a,b Values  "+a+"  "+b);
			//Logic5
			b=a+b-(a=b);
			
			System.out.println("After swapping Numbers a,b values  "+a+"  "+b);

		}
}
