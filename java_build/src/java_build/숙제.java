package java_build;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		String com_kwb =""; //가위 0, 바위 1, 보 2
		int com_kwb_num= 0;

		String my_kwb=""; //가위 0, 바위 1, 보 2
		int my_kwb_num=0;

		int menu = 0;
		String juge = "";  

		String quit="";
		while(!quit.toUpperCase().equals("Q")) {
			//여기까지가 입력

			com_kwb_num = (int)(Math.random()*3);

			System.out.println("컴퓨터는 결정했습니다.");
			System.out.println("당신의 선택은?");
			System.out.println("1.가위 2.바위 3.보");

			Scanner scann= new Scanner(System.in);
			while(true) {
				menu=scann.nextInt(); scann.nextLine();
//   엔터도 문자로 인식하기 떄문에 넥스트 라인을 넣어서 엔터도 앞에서 인식시킬수 있게 만듬
//				while이 아니라 do while쓰는것이 더 낫다.

				if (menu < 1 || menu > 3) {
					System.out.println("잘못 입력하였습니다.");
				}else {
					break;
				}
			}

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

			if(my_kwb_num == 0) {
				my_kwb = "가위";
			}else if(my_kwb_num == 1) {
				my_kwb = "바위";
			}else {
				my_kwb = "보";
			}
			if(com_kwb_num == 0) {
				com_kwb = "가위";
			}else if(com_kwb_num == 1) {
				com_kwb = "바위";
			}else {
				com_kwb = "보";
			}


			//출력

			System.out.println("컴퓨터: "+com_kwb);
			System.out.println("당신: "+my_kwb);
			System.out.println(juge);

			System.out.println("더 하시겠습니까?(그만:Q)");
			System.out.println("계속하시려면 아무키나 누르세요.");
			quit=scann.nextLine();
			System.out.println("가위바위보를 종료합니다.");


		}

	}
}

