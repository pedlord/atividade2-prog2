
public class questaoSeis {
	public static void main(String args[]) {
		double x = 2;
		double y = -3;
		double a = 4;
		double b = 5;
		System.out.printf("ponto 1: (%2f;%2f) %nponto 2: (%2f;%2f) %n",x,y,a,b); 
		System.out.println("a distancia entre esses dois pontos é: " + distance(x,y,a,b));
	}
	public static double distance(double x, double y, double a, double b) {
		double d = (a - x) * (a - x);
		d = d + (b - y) * (b - y);
		return Math.sqrt(d);
	}
}
