import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��genin 1. kenar uzunlu�unu giriniz");
		int k1 = scanner.nextInt();
		
		System.out.println("��genin 2. kenar uzunlu�unu giriniz");
		int k2 = scanner.nextInt();
		
		System.out.println("��genin 3. kenar uzunlu�unu giriniz");
		int k3 = scanner.nextInt();
		
		double u = (k1 + k2 + k3) / 2;
		double cevre = 2 * u;
		
		double alan = u * (u - k1) * (u - k2) * (u - k3);
		
		System.out.println("Alan: " + alan);
		System.out.println("�evre " + cevre);
	}
}
