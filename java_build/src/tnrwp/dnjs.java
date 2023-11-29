package tnrwp;

import java.util.Scanner;

import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class dnjs extends Shape
implements Inputable, Outputable{

	private int qkswlfma;
	
	public dnjs() {}
	public dnjs(int qkswlfma) {
		this.qkswlfma = qkswlfma;
	}
	@Override
	public int surface() {
		return (int)(qkswlfma*qkswlfma*Math.PI);
	}
	public int getQkswlfma() {
		return qkswlfma;
	}
	public void setQkswlfma(int qkswlfma) {
		this.qkswlfma = qkswlfma;
	}
	@Override
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("반지름: ");
		this.qkswlfma = scann.nextInt();
		scann.nextLine();
	}
	@Override
	public String output() {	
		return "원의 넓이";
	
	}
	
	
	}
	
//
