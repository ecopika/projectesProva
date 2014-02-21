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
		
		return a+"x² + "+b+"x + "+c;
		
	}
	
	public boolean arrelsReals(){
		return calcularDiscriminant()>=0;
	}
	
	public int nombreSolucions(){
		if(calcularDiscriminant()==0){
			return 1;
		}
		else if(calcularDiscriminant()>0){
			return 2;
		}
		else return 0;
	}
	
	public double solucio1(){
		return (-b-Math.sqrt(calcularDiscriminant())/2*a);
	}
	
	public double solucio2(){
		return (-b+Math.sqrt(calcularDiscriminant())/2*a);
	}

}
