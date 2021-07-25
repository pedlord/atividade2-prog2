
public class questaoUm {
	public static void main(String args[]) {
		int x= 2;
		int y= 3;
		int z= 4;
		//letra a:
		System.out.println("hypotenuse:" + hypotenuse(x,y));
		//letra b:
		System.out.println("smallest:" + smallest(x,y,z));
		//letra c:
		instructions();
		//letra d:
		System.out.println("intToFloat:" + intToFloat(x));
	}
	public static double hypotenuse(double a, double b) {
		double c= a*a  + b*b;
		return Math.sqrt(c);
	}
	public static int smallest(int x, int y, int z) {
		int c = 0;
		if ((x<=y) & (x <= z))
			c = x;
		else if ((y<=x) & (y<=z))
			c=y;
		else if ((z<=x) & (z<=y))
			c=z;
		return c;
	}
	public static void instructions() {
		System.out.println("instructions: exibindo uma instrução");
	}
	public static float intToFloat(int number) {
		return number;
	}
}
