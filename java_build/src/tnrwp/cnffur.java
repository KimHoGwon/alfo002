package tnrwp;

import java.util.Scanner;

import tnrwp.tkarkrgud;

import tnrwp.spah;

import tnrwp.dnjs;



public class cnffur {

	public static void main(String[] args) {
		
	String ehgud="";//1.삼각형 2.사각형 3.원
	int ehgud_num=0;
	
	int menu=0;
	String juge = "";
	
	String quit="";
	while(!quit.toUpperCase().equals("q")) {
		ehgud_num = new Scanner(System.in);
		
		System.out.println("넓이를 구할 도형을 선택해주세요.");
		System.out.println("1. 삼각형 2. 사각형 3. 원");
		Scanner scann= new Scanner(System.in);
		while(true) {
			menu= scann.nextInt(); scann.nextLine();
			
			if (menu<1||menu>3) {
				System.out.println("잘못 입력하였습니다.");
			}else {
				break;
			}
		}
	ehgud_num = menu-1;
	
	if(ehgud_num == 0) {
		ehgud=new tnrwp[];
	}else if(ehgud_num == 1) {
		ehgud=sjfqdl1;
	}else {
		ehgud=sjfqdl2;
	}
	}
	
	System.out.println("다른 도형 넓이를 계산하시겠습니까?(그만:Q)");
	System.out.println("계속하시려면 아무키나 누르세요.");
	quit=scann.nextLine();
	System.out.println("넓이 계산을 종료합니다.");

	}

}
