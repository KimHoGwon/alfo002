package java_build;

import java.util.Scanner;

public class operation2 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		float inputfloat = 0;
		float ban=0f;
//		실수입력 : scann.NextFloat()
		
		System.out.print("반올림할 수를 입력하세요: ");
		inputfloat = scann.nextFloat();
		
	    ban=(int)((inputfloat*100+5)/10)/10f;

		System.out.println("입력값 : "+inputfloat);
		System.out.println("두번째 자리 반올림 : "+ban);	
		
	}

}
