package com.kaua.pi.ado02;

import java.util.Scanner;

public class ADO02_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Escreva um nome não composto: ");
		String name = input.next();

		System.out.println("Quantidade de caracteres em "+ name +" : " + name.length());
	}

}
