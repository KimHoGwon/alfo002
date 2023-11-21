package java_build;

public class casting {

	public static void main(String[] args) {
		
			byte b = 120;
			short s = 3000;
			int i = 200000;
			long l = 9l;
			float f = 2f;
			double d = 2;
			
			
		    b = (byte)i;

			System.out.println(b);
			
			System.out.println(1/2);
			System.out.println(1/2f);
			
			System.out.println(s/i);
			System.out.println(s/f);
			
			System.out.println("¸ò : "+ s/i);
			System.out.println("³ª¸ÓÁö : "+ s%i);

			System.out.println("¸ò : "+ s/i + "\t³ª¸ÓÁö : "+ s%i);
}
}