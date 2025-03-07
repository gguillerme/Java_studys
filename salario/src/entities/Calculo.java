package entities;

public class Calculo {
	
	public String nameCalc;
	public double brutoCalc;
	public double taxasCalc;
	public double percentCalc;

	public double salarioLiquido() {
		return  brutoCalc - taxasCalc;
	}
	
	public double aumentoSalario(){
		double fatorAumento = 1 + (percentCalc/100);
		return salarioLiquido() * fatorAumento;
	}
	

}
