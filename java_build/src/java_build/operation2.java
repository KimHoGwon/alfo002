package java_build;

import java.util.Scanner;

public class operation2 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		float inputfloat = 0;
		float ban=0f;
//		�Ǽ��Է� : scann.NextFloat()
		
		System.out.print("�ݿø��� ���� �Է��ϼ���: ");
		inputfloat = scann.nextFloat();
		
	    ban=(int)((inputfloat*100+5)/10)/10f;

		System.out.println("�Է°� : "+inputfloat);
		System.out.println("�ι�° �ڸ� �ݿø� : "+ban);	
		
	}

}
