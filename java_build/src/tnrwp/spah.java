package tnrwp;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class spah extends Shape
implements Inputable, Outputable{

	private int rkfh=0;
	private int tpfh=0;

	public spah() {}
	public spah(int rkfh, int tpfh) {
		this.rkfh = rkfh;
		this.tpfh = tpfh;
	}
	@Override
	public int surface() {
		return rkfh*tpfh;

	}
	public int getRkfh() {
		return rkfh;
	}
	public void setRkfh(int rkfh) {
		this.rkfh = rkfh;
	}
	public int getTpfh() {
		return tpfh;
	}
	public void setTpfh(int tpfh) {
		this.tpfh = tpfh;
	}
	@Override
	public void input() {
		Scanner scann = new Scanner(System.in);

		System.out.print("����: ");
		this.rkfh = scann.nextInt();
		scann.nextLine();
		System.out.print("����: ");
		this.tpfh = scann.nextInt();
		scann.nextLine();
	}
	@Override
	public String output() {
		return "�簢�� ����";
	}

}








