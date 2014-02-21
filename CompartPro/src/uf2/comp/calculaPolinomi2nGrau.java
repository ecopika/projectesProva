package uf2.comp;

import java.util.Scanner;

public class calculaPolinomi2nGrau {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Polinomi2nGrau pol = new Polinomi2nGrau(12, 2, 4);
		int a,b,c;
		
		System.out.println(pol.toString());
		
		pol.solucio1();
		pol.solucio2();
		System.out.println("Introdueix a");
		a=sc.nextInt();
		
		System.out.println("Intordueix b");
		b=sc.nextInt();
		
		System.out.println("Introdueix c");
		c=sc.nextInt();
		
	

	}

}
