package java_build;

import java.util.Scanner;

public class 소수 {

	public static void main(String[] args) {
//		
		Scanner scann = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int temp = 0;
		temp = scann.nextInt();
		
		boolean juge = true;
		
		for(int i=2; i<temp;i++) {
			if(temp%i == 0)
				juge = false;
		}
		
		if(juge) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
