package util;

public class Convertor {
	public static double IOF = 0.06;
	
	public static double conversor(double x, double y) {
		return x * y * (1.0 + IOF);
	}

}
