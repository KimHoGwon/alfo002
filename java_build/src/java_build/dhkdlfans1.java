package java_build;

import java.util.Scanner;

public class dhkdlfans1 {

	public static void main(String[] args) {
		
		String menu = "";
		
		//while: for�� ����ϳ� ������ Ʈ��� �ݺ��ϰ� �޽��� �ݺ� ����
		
		while(!menu.toUpperCase().equals("Q")) { 
			System.out.println("1. ȸ������ 2. ȸ����ȸ 3. ȸ������ 4. ȸ������");
			System.out.println("�޴��� �����ϼ���. ����: Q");

			Scanner scann = new Scanner(System.in);
			menu= scann.nextLine();

			switch(menu) {
			case "1":
				System.out.println("ȸ������ ����");
				break;
			case "2":
				System.out.println("ȸ����ȸ ����");
				break;
			case "3":
				System.out.println("ȸ������ ����");
				break;
			case "4":
				System.out.println("ȸ������ ����");
				break;
			case "Q":
			case "q":
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:;
				System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�.");

		}
		}
		
//		do{ 
//			System.out.println("1. ȸ������ 2. ȸ����ȸ 3. ȸ������ 4. ȸ������");
//			System.out.println("�޴��� �����ϼ���. ����: Q");
//
//			Scanner scann = new Scanner(System.in);
//			menu= scann.nextLine();
//
//			switch(menu) {
//			case "1":
//				System.out.println("ȸ������ ����");
//				break;
//			case "2":
//				System.out.println("ȸ����ȸ ����");
//				break;
//			case "3":
//				System.out.println("ȸ������ ����");
//				break;
//			case "4":
//				System.out.println("ȸ������ ����");
//				break;
//			case "Q":
//			case "q":
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			default:;
//				System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�.");
//
//		}
//		}while(!menu.toUpperCase().equals("Q"));


	}

}
