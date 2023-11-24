package java_build;

public class 스위치 {

	public static void main(String[] args) {
		
		int inputInt = 97;
		
		switch(inputInt%7) {
		case 0:
		case 1:
			System.out.println("나머지가 0 또는 1입니다.");
			break;
		case 2:
		case 3:
			System.out.println("나머지가 2또는 3입니다.");
			break;
		case 4:
			System.out.println("나머지가 4입니다.");
			break;
		default:
			System.out.println("나머지가 5또는 6입니다.");
		}
		
		

	}

}
