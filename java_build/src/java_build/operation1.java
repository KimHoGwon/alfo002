package java_build;

import java.util.Scanner;

public class operation1 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
//		정수입력 : scann.NextInt()
//		실수입력 : scann.NextFloat()
		
		System.out.print("정수를 입력: ");
		int a = scann.nextInt();
		
		System.out.print("실수를 입력: ");
		int b = scann.nextInt();
		
		System.out.println("입력한 정수: "+a);
		System.out.println("입력한 실수: "+b);
		System.out.println();
		System.out.println("첫번째 정수 : "+a);
		System.out.println("두번째 정수 : "+b);	
		System.out.println();
		System.out.println("더하기 : "+ (a+b));
		System.out.println("빼기 :"+ (a-b));
		System.out.println("곱하기 : "+ (a*b));
		System.out.println("나누기 : "+ (a/(float)b));
		System.out.println();
		System.out.println("몫 : "+ (b/a));
		System.out.println("나머지 : "+ (b%a));

}
}