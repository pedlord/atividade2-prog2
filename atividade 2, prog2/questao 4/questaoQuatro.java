import java.util.Scanner;

public class questaoQuatro {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		int num = 1;
		boolean h;
		System.out.println("Digite o n�mero para saber se � par ou impar, ou 0 para sair:");
		Scanner numero = new Scanner(System.in);
		num = numero.nextInt();
		while (true) {
			h= isEven(num);
			if (h==true) {
				System.out.printf("%d � par %n", num);
				if (num == 0) {
					System.out.println("saindo");
					break;
				}
			}
			else if (h==false) {
				System.out.printf("%d � impar %n", num);
			}
			System.out.println("Digite o n�mero para saber se � par ou impar, ou 0 para sair:");
			num = numero.nextInt();
		}
	}
	public static boolean isEven(int a) {
		if (a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
