package entities;

public class Notas {
	
	public int primeiroTri;
	public int segundoTri;
	public int terceiroTri;
	
	
	public int notaTotal() {
		return primeiroTri + segundoTri + terceiroTri;
	}

	public int calculoAno() {
		if(notaTotal() > 60) {
			return 1;
		}else {
			return 2;
			
		}
	}
	public int calculoNotaFaltante() {
		return Math.abs(notaTotal() - 100);
	}
}
