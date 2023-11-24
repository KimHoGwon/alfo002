package java_build;

import java.util.Scanner;

public class dhkdlfans1 {

	public static void main(String[] args) {
		
		String menu = "";
		
		//while: for랑 비슷하나 조건이 트루면 반복하고 펄스면 반복 종료
		
		while(!menu.toUpperCase().equals("Q")) { 
			System.out.println("1. 회원가입 2. 회원조회 3. 회원수정 4. 회원삭제");
			System.out.println("메뉴를 선택하세요. 종료: Q");

			Scanner scann = new Scanner(System.in);
			menu= scann.nextLine();

			switch(menu) {
			case "1":
				System.out.println("회원가입 서비스");
				break;
			case "2":
				System.out.println("회원조회 서비스");
				break;
			case "3":
				System.out.println("회원수정 서비스");
				break;
			case "4":
				System.out.println("회원삭제 서비스");
				break;
			case "Q":
			case "q":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:;
				System.out.println("메뉴선택이 올바르지 않습니다.");

		}
		}
		
//		do{ 
//			System.out.println("1. 회원가입 2. 회원조회 3. 회원수정 4. 회원삭제");
//			System.out.println("메뉴를 선택하세요. 종료: Q");
//
//			Scanner scann = new Scanner(System.in);
//			menu= scann.nextLine();
//
//			switch(menu) {
//			case "1":
//				System.out.println("회원가입 서비스");
//				break;
//			case "2":
//				System.out.println("회원조회 서비스");
//				break;
//			case "3":
//				System.out.println("회원수정 서비스");
//				break;
//			case "4":
//				System.out.println("회원삭제 서비스");
//				break;
//			case "Q":
//			case "q":
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			default:;
//				System.out.println("메뉴선택이 올바르지 않습니다.");
//
//		}
//		}while(!menu.toUpperCase().equals("Q"));


	}

}
