import java.util.Scanner;

public class questaoCinco {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		double num = 0;
		double h = 0;
		String tempo = "s";
		
		System.out.println("Digite a temperatura que deseja converter (c ou f) ou s para sair");
		System.out.println("c irá converter para fahrenheit e f para celsius:");
		Scanner tem = new Scanner(System.in);
		
		tempo = tem.next();
		Scanner numero = new Scanner(System.in);

		num = corf(tempo, numero, num);
		while (!tempo.equals("s")){
			if (tempo.equals("f")) {
				h = celsius(num);
				System.out.printf("%2f ºF em celsius: %2f ºC%n", num, h);
			}
			else if (tempo.equals("c")) {
				h = fahrenheit(num);
				System.out.printf("%2f ºC em fahrenheit: %2f ºF%n", num , h);
			}
			else if (!tempo.equals("f") & !tempo.equals("c")) {
				System.out.println("Digite apenas c, f ou s");
			}
			System.out.println("Digite a temperatura que será convertida(c ou f) ou s para sair:");
			System.out.println("c irá converter para fahrenheit e f para celsius:");
			tempo = tem.next();
			if (tempo.equals("s")) {
				System.out.println("saindo");
				break;
			}
			num = corf(tempo, numero, num);
		}
	}
	public static double corf(String tempo, Scanner numero, double num) {
		if (tempo.equals("c")) {
			System.out.println("Digite a temperatura celsius para converter em fahrenheit:");
			num = numero.nextDouble();
			return num;
		}
		else if (tempo.equals("f")) {
			System.out.println("Digite a temperatura fahrenheit para converter em celsius:");
			num = numero.nextDouble();
			return num;
		}
		return num;
	}
	public static double celsius(double f) {
		double cels = 5.0 / 9.0 * (f - 32.0);
		return cels;
	}
	public static double fahrenheit(double c) {
		double fahren = 9.0 / 5.0 * c + 32.0;
		return fahren;
	}
}
