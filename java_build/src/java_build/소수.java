package java_build;

import java.util.Scanner;

public class �Ҽ� {

	public static void main(String[] args) {
//		
		Scanner scann = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		
		int temp = 0;
		temp = scann.nextInt();
		
		boolean juge = true;
		
		for(int i=2; i<temp;i++) {
			if(temp%i == 0)
				juge = false;
		}
		
		if(juge) {
			System.out.println("�Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}

}
