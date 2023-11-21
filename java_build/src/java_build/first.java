package java_build;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
	
		Scanner scann = new Scanner(System.in);
		
//		정수입력 : scann.NextInt()
		
		int inputint=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
		System.out.print("4자리 정수를 입력: ");
		inputint = scann.nextInt();
		a=inputint/1000;
		b=(inputint/100)-(10*a);
		c=(inputint/10)-(100*a)-(10*b);
		d=inputint-(1000*a)-(100*b)-(10*c);
		
		System.out.println("4자리 숫자: "+a);
		System.out.println("3자리 숫자: "+b);
		System.out.println("2자리 숫자: "+c);
		System.out.println("1자리 숫자: "+d);
	}
}
