package java_build;

import java.util.Scanner;

public class 숙제스위치 {

	public static void main(String[] args) {
		String com_kwb =""; //가위 0, 바위 1, 보 2
		int com_kwb_num= 0;
		
		String my_kwb=""; //가위 0, 바위 1, 보 2
		int my_kwb_num=0;
		
		int menu = 0;
		String juge = "";  
		
		//여기까지가 입력
		
		com_kwb_num = (int)(Math.random()*3);
		
		System.out.println("컴퓨터는 결정했습니다.");
		System.out.println("당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");
		
		Scanner scann= new Scanner(System.in);
		menu=scann.nextInt();
		my_kwb_num = menu-1;
		
		if(com_kwb_num == ((my_kwb_num+1)%3)) {
			juge = "당신이 졌습니다.";
		}else {
			if(com_kwb_num == my_kwb_num) {
				juge = "비겼습니다.";
			}else {
				juge = "당신이 이겼습니다.";
			}
		}
		switch(my_kwb_num) {
		case 0:
			my_kwb = "가위";
			break;
		case 1:
			my_kwb = "바위";
			break;
		case 2:
			my_kwb = "보";
		}
		
		switch(com_kwb_num) {
		case 0:
			com_kwb = "가위";
			break;
		case 1:
			com_kwb = "바위";
			break;
		case 2:
			com_kwb = "보";
		}
		
		//출력
		
		System.out.println("컴퓨터: "+com_kwb);
		System.out.println("당신: "+my_kwb);
		System.out.println(juge);
		
	}
}
