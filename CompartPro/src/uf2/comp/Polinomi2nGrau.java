package uf2.comp;

public class Polinomi2nGrau {
	private int a;
	private int b;
	private int c;
	
	public Polinomi2nGrau(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int calcularDiscriminant(){
		
		return (b*b)-(4*a*c);
	}
	
	public String toString(){
		
		return a+"x² + "+b+"x + "+c ;
		
	}

}
