package tnrwp;

import java.util.Scanner;

public class tkarkrgud {

	
	public int alxqus;
	public int shvdl;
	public int sjfqdl() {
		return ((int)(alxqus+shvdl)/2);
	}
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("�غ�: ");
		alxqus=scann.nextInt();scann.nextLine();
		
		System.out.print("����: ");
		shvdl=scann.nextInt();scann.nextLine();
	}
	
	public void printLabel() {
		System.out.println("����: "+sjfqdl());
	}

	}

