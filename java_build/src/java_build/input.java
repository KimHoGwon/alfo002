package java_build;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		
//		�����Է� : scann.NextInt()
//		�Ǽ��Է� : scann.NextFloat()
		
		System.out.print("������ �Է�: ");
		int inputint = scann.nextInt();
		
		System.out.print("�Ǽ��� �Է�: ");
		float inputfloat = scann.nextFloat();
		
		System.out.println("�Է��� ����: "+inputint);
		System.out.println("�Է��� �Ǽ�: "+inputfloat);
		
		
	
	}

}
