package java_build;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		String com_kwb =""; //���� 0, ���� 1, �� 2
		int com_kwb_num= 0;

		String my_kwb=""; //���� 0, ���� 1, �� 2
		int my_kwb_num=0;

		int menu = 0;
		String juge = "";  

		String quit="";
		while(!quit.toUpperCase().equals("Q")) {
			//��������� �Է�

			com_kwb_num = (int)(Math.random()*3);

			System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
			System.out.println("����� ������?");
			System.out.println("1.���� 2.���� 3.��");

			Scanner scann= new Scanner(System.in);
			while(true) {
				menu=scann.nextInt(); scann.nextLine();
//   ���͵� ���ڷ� �ν��ϱ� ������ �ؽ�Ʈ ������ �־ ���͵� �տ��� �νĽ�ų�� �ְ� ����
//				while�� �ƴ϶� do while���°��� �� ����.

				if (menu < 1 || menu > 3) {
					System.out.println("�߸� �Է��Ͽ����ϴ�.");
				}else {
					break;
				}
			}

			my_kwb_num = menu-1;

			if(com_kwb_num == ((my_kwb_num+1)%3)) {
				juge = "����� �����ϴ�.";
			}else {
				if(com_kwb_num == my_kwb_num) {
					juge = "�����ϴ�.";
				}else {
					juge = "����� �̰���ϴ�.";
				}
			}

			if(my_kwb_num == 0) {
				my_kwb = "����";
			}else if(my_kwb_num == 1) {
				my_kwb = "����";
			}else {
				my_kwb = "��";
			}
			if(com_kwb_num == 0) {
				com_kwb = "����";
			}else if(com_kwb_num == 1) {
				com_kwb = "����";
			}else {
				com_kwb = "��";
			}


			//���

			System.out.println("��ǻ��: "+com_kwb);
			System.out.println("���: "+my_kwb);
			System.out.println(juge);

			System.out.println("�� �Ͻðڽ��ϱ�?(�׸�:Q)");
			System.out.println("����Ͻ÷��� �ƹ�Ű�� ��������.");
			quit=scann.nextLine();
			System.out.println("������������ �����մϴ�.");


		}

	}
}

