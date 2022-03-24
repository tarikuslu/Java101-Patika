import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen boyunuzu giriniz: (cm)");
		double boy = scanner.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz:");
		double kilo = scanner.nextDouble();
		
		double vucutKitleIndeksi = kilo / Math.pow(boy, 2);
		
		System.out.println("Vücut kitle indeksiniz: " + vucutKitleIndeksi);
	}

}
