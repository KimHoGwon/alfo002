package java_build;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
	
		Scanner scann = new Scanner(System.in);
		
//		�����Է� : scann.NextInt()
		
		int inputint=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
		System.out.print("4�ڸ� ������ �Է�: ");
		inputint = scann.nextInt();
		a=inputint/1000;
		b=(inputint/100)-(10*a);
		c=(inputint/10)-(100*a)-(10*b);
		d=inputint-(1000*a)-(100*b)-(10*c);
		
		System.out.println("4�ڸ� ����: "+a);
		System.out.println("3�ڸ� ����: "+b);
		System.out.println("2�ڸ� ����: "+c);
		System.out.println("1�ڸ� ����: "+d);
	}
}
