package main;

import java.util.Scanner;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		String nombre = "Lautaro";
		String apellido = "Montes De Oca";
		double sueldo = 25000.50;
		// declaro la variable de nomnre sc
		//la inicializo para poder   leer datos de la consola
		Scanner sc = new Scanner(System.in);
		//leo los datos de la cosola
		System.out.println("adivina el nombre");
		String nombreIngresado = sc.next();
		//System.out.println(nombre);
		if (nombreIngresado.equals(nombre)){
			System.out.print("nombre acertado");
		}
		
		
		
		
		

	}

}
