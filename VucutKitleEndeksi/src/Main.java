import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("L�tfen boyunuzu giriniz: (cm)");
		double boy = scanner.nextDouble();
		System.out.println("L�tfen kilonuzu giriniz:");
		double kilo = scanner.nextDouble();
		
		double vucutKitleIndeksi = kilo / Math.pow(boy, 2);
		
		System.out.println("V�cut kitle indeksiniz: " + vucutKitleIndeksi);
	}

}
