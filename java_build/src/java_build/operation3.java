package java_build;

import java.util.Scanner;

public class operation3 {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
//		�����Է�: scann.NextInt()

		int kor= 0;
		int eng= 0;
		int math= 0;
		int sci= 0;
		int total=0;
	    float ave=0f;   

		System.out.print("�������� �Է�: ");
		kor= scann.nextInt();
		System.out.print("�������� �Է�: ");
		eng= scann.nextInt();
		System.out.print("�������� �Է�: ");
		math= scann.nextInt();
		System.out.print("�������� �Է�: ");
		sci= scann.nextInt();
	    			 
	    total=kor+eng+math+sci;	
	    ave=total/4f;
	    ave=(int)((ave*100+5)/10)/10f;
	    
	    System.out.println("����\t����\t����\t����\t����\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,sci,total,ave);
			
	}

}
