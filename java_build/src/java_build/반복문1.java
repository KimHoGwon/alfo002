package java_build;

public class 반복문1 {

	public static void main(String[] args) {
		
		String result="";
//		
//		int inputInt=0;
//		int sum=0;
//		
//		
//		for(int i=1; i<=10;i++) {
//			inputInt++;
//			sum = sum+inputInt;
//			
//
//			int sum=1;
//			
//			for(int i=1; i<10; i=i+1) {
//				sum = i*2;
//			
//			System.out.println("2 * "+i+" = "+sum);
//		
//			
//			int sum =2;
//			String result="";
//			
//			for(int i=1; i<10; i=i++) {
//			 result = result+(sum+ " * "+i+" = "+(sum*i)+"/n");
//			}
//	        System.out.println(result);

		
		//     중첩 포문		
		for(int dan=2; dan < 10; dan++) {
			for(int gop=1; gop<10; gop++) {
				result = result+ (dan+"*"+ gop +"="+(dan*gop)+"\n" );
		
			}
		result = result+"\n";
		
			System.out.println(result);
		}
}
}
