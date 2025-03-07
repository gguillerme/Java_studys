package entities;

public class Retangulo {

	public double alturaProgram;
	public double larguraProgram;
	public String frase;


	public double area(double altura) {
		return larguraProgram * alturaProgram;
	}

	public double perimetro(double largura) {
		return 2 * (larguraProgram + alturaProgram);
	}
	
	public double diagonal(double largura, double altura) {
		return Math.sqrt(Math.pow(larguraProgram, 2) + Math.pow(alturaProgram, 2));
	}
	
	public String toString() {
		return frase
				+ "DIAGONAL = " 
				+ String.format("%.2f", diagonal(0, 0));
		
	}

}

