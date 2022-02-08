package main;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*leer un string desde la consola y lo va aconvertir a 
		double*/
		Scanner sc= new Scanner (System.in);
		System.out.println("ingrese el primer numero");
		String num1Str= sc.next();
		System.out.println("ingrese el segundo numero");
		String num2Str= sc.next();
		//convertir a double
		double num1 = Double.parseDouble (num1Str);
		double num2 = Double.parseDouble (num2Str);
		System.out.print("La Suma Es: ");
		double suma = num1+num2;
		double resta = num1-num2;
		double mult = num1*num2;
		double div = num1/num2;
		double resto = num1%num2;
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La mult es:"+mult);
		System.out.println("La div es:"+div);
		System.out.println("La resto es:"+resto);
		int a = 5;
		a++;
		a=a+1;
		System.out.println(a);
		a--;
		System.out.println(a);
		//comentario
		
		
		
		
		
		
		

	}

}
