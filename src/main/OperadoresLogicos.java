package main;

import java.util.Scanner;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean adivino=false;
		//con maximo 5 intentos
		do {
			int x = 120;
			Scanner sc = new Scanner(System.in);
			String numStr = sc.next();
			int numIng = Integer.parseInt(numStr);
			adivino = (numIng == x);
			//ing 140
			if (numIng == x) {
				System.out.println("Lo Adivinastes");
			} else if (numIng > x) {
				System.out.println("el numero a adivinar es menor");
			} else if (numIng < x) {
				System.out.println("el numeroa adivinar es mayor");
			}
			
		} while (!adivino);
		
		
	}

}
