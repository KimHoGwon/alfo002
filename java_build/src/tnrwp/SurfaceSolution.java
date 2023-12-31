package tnrwp;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class SurfaceSolution {

	private Shape s;
	private int menu;
	
	public void start() {
		
		do {
			input();

			process();

			output();
			
		}while(true);
	}
	
	protected void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("1. 삼각형 2. 사각형 3. 원");
		System.out.println("도형을 선택하세요.");
		menu = scann.nextInt();scann.nextLine();
		
		Inputable inputObject = null;

		switch(menu){
		case 1:
			inputObject = new tkarkrgud();
			break;
		case 2:
			inputObject= new spah();
			break;
		case 3:
			inputObject= new dnjs();
			break;
		default:
			System.out.println("입력이 올바르지 않습니다.");
		}
		
		inputObject.input();
		
		s=(Shape)inputObject;
	}
	protected void process() {
		switch(menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);	}//강제종료(비추천)
	}
	protected void output() {
		
		Outputable outObject = (Outputable)s;
		
		System.out.println(outObject.output()+s.surface());
		
		System.out.println("계속하시겠습니까?(종료:Q)");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			
		}

}
}
