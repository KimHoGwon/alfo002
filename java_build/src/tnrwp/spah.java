package tnrwp;

import java.util.Scanner;

public class spah {

	public int rkfh;
	public int tpfh;
	public int sjfqdl4() {
		return (int)rkfh+tpfh;
	}
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("����: ");
		rkfh=scann.nextInt();scann.nextLine();
		
		System.out.print("����: ");
		tpfh=scann.nextInt();scann.nextLine();
	}
	
	public void printLabel() {
		System.out.println("����: "+sjfqdl4());
	}

	}


	
	

