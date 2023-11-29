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

		System.out.print("밑변: ");
		this.alxqus = scann.nextInt();
		scann.nextLine();
		System.out.print("높이: ");
		this.shvdl = scann.nextInt();
		scann.nextLine();
	}

	@Override
	public String output() {
		return "삼각형 넓이";

	}

}






//Over-loading : 한 클래스 내에서 리턴타입이 같고 메소드명이 같으면
//같은 타입이면 순서 무관, 다른 타입이면 순서 따짐
//지역변수