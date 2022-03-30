package com.kaua.pi.ado03;

import java.util.Scanner;

public class ADO03_03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int year = 0;
		while (year < 1000) {
			System.out.print("Digite um ano com 4 dígitos: ");
			year = input.nextInt();
		}

		if (year % 4 == 0) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto!");
		}
	}

}
