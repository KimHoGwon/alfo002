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
		
		System.out.print("가로: ");
		rkfh=scann.nextInt();scann.nextLine();
		
		System.out.print("세로: ");
		tpfh=scann.nextInt();scann.nextLine();
	}
	
	public void printLabel() {
		System.out.println("넓이: "+sjfqdl4());
	}

	}


	
	

