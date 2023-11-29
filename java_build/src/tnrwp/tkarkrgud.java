package tnrwp;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;


public class tkarkrgud extends Shape
implements Inputable,Outputable{

	private int alxqus=10;
	private int shvdl=100;

	public tkarkrgud() {}	

	public tkarkrgud(int alxqus, int shvdl) {
		this.alxqus = alxqus;
		this.shvdl = shvdl;
	}

	@Override
	public int surface() {
		return(int)(shvdl*alxqus*0.5f);
	}


	public int getAlxqus() {
		return alxqus;
	}

	public void setAlxqus(int alxqus) {
		this.alxqus = alxqus;
	}

	public int getShvdl() {
		return shvdl;
	}

	public void setShvdl(int shvdl) {
		this.shvdl = shvdl;
	}

	@Override
	public void input() {
		Scanner scann = new Scanner(System.in);

		System.out.print("�غ�: ");
		this.alxqus = scann.nextInt();
		scann.nextLine();
		System.out.print("����: ");
		this.shvdl = scann.nextInt();
		scann.nextLine();
	}

	@Override
	public String output() {
		return "�ﰢ�� ����";

	}

}






//Over-loading : �� Ŭ���� ������ ����Ÿ���� ���� �޼ҵ���� ������
//���� Ÿ���̸� ���� ����, �ٸ� Ÿ���̸� ���� ����
//��������