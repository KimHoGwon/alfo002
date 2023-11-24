package java_build;

import java.util.Scanner;

public class operation4 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
//		정수입력 : scann.NextInt()
//		실수입력 : scann.NextFloat()
		
		System.out.print("정수를 입력: ");
		int a =0;
		String result = "";
		
		a = scann.nextInt();
		
		boolean condition = a % 2 != 0 
						 && a % 3 != 0
						 && a % 5 != 0;
		
		if(condition) {result="2,3,5의 배수가 아닙니다.";
		
		}else {
			if(a % 2 ==0) {
				result= result+"2";}
			if(a % 3 == 0 ) {
				result= result+", 3";}
			if(a % 5 == 0) {
				result= result+", 5";
				}else {
					result = result + "배수입니다.";}
		
		System.out.println("입력한 정수: "+a);
		System.out.println(result);
		


}
	}
}
