package java_build;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		
//		정수입력 : scann.NextInt()
//		실수입력 : scann.NextFloat()
		
		System.out.print("정수를 입력: ");
		int inputint = scann.nextInt();
		
		System.out.print("실수를 입력: ");
		float inputfloat = scann.nextFloat();
		
		System.out.println("입력한 정수: "+inputint);
		System.out.println("입력한 실수: "+inputfloat);
		
		
	
	}

}
