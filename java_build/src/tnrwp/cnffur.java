package tnrwp;

import java.util.Scanner;

import tnrwp.tkarkrgud;

import tnrwp.spah;

import tnrwp.dnjs;



public class cnffur {

	public static void main(String[] args) {
		
	String ehgud="";//1.�ﰢ�� 2.�簢�� 3.��
	int ehgud_num=0;
	
	int menu=0;
	String juge = "";
	
	String quit="";
	while(!quit.toUpperCase().equals("q")) {
		ehgud_num = new Scanner(System.in);
		
		System.out.println("���̸� ���� ������ �������ּ���.");
		System.out.println("1. �ﰢ�� 2. �簢�� 3. ��");
		Scanner scann= new Scanner(System.in);
		while(true) {
			menu= scann.nextInt(); scann.nextLine();
			
			if (menu<1||menu>3) {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
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
	
	System.out.println("�ٸ� ���� ���̸� ����Ͻðڽ��ϱ�?(�׸�:Q)");
	System.out.println("����Ͻ÷��� �ƹ�Ű�� ��������.");
	quit=scann.nextLine();
	System.out.println("���� ����� �����մϴ�.");

	}

}
