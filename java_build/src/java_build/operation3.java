package java_build;

import java.util.Scanner;

public class operation3 {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
//		정수입력: scann.NextInt()

		int kor= 0;
		int eng= 0;
		int math= 0;
		int sci= 0;
		int total=0;
	    float ave=0f;   

		System.out.print("국어점수 입력: ");
		kor= scann.nextInt();
		System.out.print("영어점수 입력: ");
		eng= scann.nextInt();
		System.out.print("수학점수 입력: ");
		math= scann.nextInt();
		System.out.print("과학점수 입력: ");
		sci= scann.nextInt();
	    			 
	    total=kor+eng+math+sci;	
	    ave=total/4f;
	    ave=(int)((ave*100+5)/10)/10f;
	    
	    System.out.println("국어\t영어\t수학\t과학\t총합\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,sci,total,ave);
			
	}

}
