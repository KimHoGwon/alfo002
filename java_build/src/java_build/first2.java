package java_build;

import java.util.Scanner;

public class first2 {
	public static void main(String[] args) {
	
		Scanner scann = new Scanner(System.in);
		
//		�����Է� : scann.NextFloat()
		
		float input= 0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
		System.out.print("4�ڸ� ������ �Է�: ");
		input = scann.nextFloat()/10000f;
		
		input= input*10;
		a=(int)(input);
		input= input-a;
		
		input= input*10;
		b=(int)(input);
		input= input-b;
		
		input= input*10;
		c=(int)(input);
		input= input-c;
		
		input= input*10;
		d=(int)(input+0.5);
		
		System.out.println("4�ڸ� ����: "+a);
		System.out.println("3�ڸ� ����: "+b);
		System.out.println("2�ڸ� ����: "+c);
		System.out.println("1�ڸ� ����: "+d);
	}
}
