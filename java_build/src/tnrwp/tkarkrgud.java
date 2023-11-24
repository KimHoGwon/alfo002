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
		
		System.out.print("πÿ∫Ø: ");
		alxqus=scann.nextInt();scann.nextLine();
		
		System.out.print("≥Ù¿Ã: ");
		shvdl=scann.nextInt();scann.nextLine();
	}
	
	public void printLabel() {
		System.out.println("≥–¿Ã: "+sjfqdl());
	}

	}

