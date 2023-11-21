package java_build;

import java.util.Scanner;

public class operation11 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		//		정수입력 : scann.nextInt()		

		int a= 0;
		int b= 0;
		
		float sum=0;   
		float minus=0;  
		float multi=0;   
		float divide=0; 
		
		int mock=0;   
		int nam=0;    
		
		System.out.print("첫번째 숫자를 입력: ");
	    a= scann.nextInt();
		System.out.print("두번째 숫자를 입력: ");
		b= scann.nextInt();
		System.out.println();
				
		  sum=a+b;
		  minus=a-b;
		  multi=a*b;
		  divide=a/(float)b;
		  
		  mock=b/a;
		  nam=b%a;
				
		System.out.println("첫번째 정수 : "+a);
		System.out.println("두번째 정수 : "+b);	
		System.out.println();
		System.out.println("더하기 : "+ sum);
		System.out.println("빼기 :"+ minus);
		System.out.println("곱하기 : "+ multi);
		System.out.println("나누기 : "+ divide);
		System.out.println();
		System.out.println("몫b/a : "+ mock);
		System.out.println("나머지b/a : "+ nam);

	}
}