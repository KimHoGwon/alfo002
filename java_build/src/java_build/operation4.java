package java_build;

import java.util.Scanner;

public class operation4 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
//		�����Է� : scann.NextInt()
//		�Ǽ��Է� : scann.NextFloat()
		
		System.out.print("������ �Է�: ");
		int a =0;
		String result = "";
		
		a = scann.nextInt();
		
		boolean condition = a % 2 != 0 
						 && a % 3 != 0
						 && a % 5 != 0;
		
		if(condition) {result="2,3,5�� ����� �ƴմϴ�.";
		
		}else {
			if(a % 2 ==0) {
				result= result+"2";}
			if(a % 3 == 0 ) {
				result= result+", 3";}
			if(a % 5 == 0) {
				result= result+", 5";
				}else {
					result = result + "����Դϴ�.";}
		
		System.out.println("�Է��� ����: "+a);
		System.out.println(result);
		


}
	}
}
