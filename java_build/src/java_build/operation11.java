package java_build;

import java.util.Scanner;

public class operation11 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		//		�����Է� : scann.nextInt()		

		int a= 0;
		int b= 0;
		
		float sum=0;   
		float minus=0;  
		float multi=0;   
		float divide=0; 
		
		int mock=0;   
		int nam=0;    
		
		System.out.print("ù��° ���ڸ� �Է�: ");
	    a= scann.nextInt();
		System.out.print("�ι�° ���ڸ� �Է�: ");
		b= scann.nextInt();
		System.out.println();
				
		  sum=a+b;
		  minus=a-b;
		  multi=a*b;
		  divide=a/(float)b;
		  
		  mock=b/a;
		  nam=b%a;
				
		System.out.println("ù��° ���� : "+a);
		System.out.println("�ι�° ���� : "+b);	
		System.out.println();
		System.out.println("���ϱ� : "+ sum);
		System.out.println("���� :"+ minus);
		System.out.println("���ϱ� : "+ multi);
		System.out.println("������ : "+ divide);
		System.out.println();
		System.out.println("��b/a : "+ mock);
		System.out.println("������b/a : "+ nam);

	}
}