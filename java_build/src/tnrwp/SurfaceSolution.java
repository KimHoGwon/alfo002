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
		System.out.println("1. �ﰢ�� 2. �簢�� 3. ��");
		System.out.println("������ �����ϼ���.");
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
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
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
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);	}//��������(����õ)
	}
	protected void output() {
		
		Outputable outObject = (Outputable)s;
		
		System.out.println(outObject.output()+s.surface());
		
		System.out.println("����Ͻðڽ��ϱ�?(����:Q)");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			
		}

}
}
