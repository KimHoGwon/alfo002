package java_build;

import java.util.Scanner;

public class qufWLrrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scann = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		
		
		String quf="";
		int wjdnt= 0;
		wjdnt = scann.nextInt();
		
		for(int i=0; i<wjdnt; i++) {
			quf=quf+"*";
		}
		
		System.out.println(quf);
	}

}
