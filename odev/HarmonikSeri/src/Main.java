import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz: ");
		int sayi = scanner.nextInt();
		
		System.out.println(sayi + " sayýsýnýn " + "Harmonik ortalamasý: " + harmonicOrtalama(5));
		
	}
	
	public static double harmonicSeri(double n) {
		double toplam = 0;
		for(int i = 1; i <=n; i++) {
			toplam = toplam + (1.0 / i);
		}
		return toplam;
	}
	
	public static double harmonicOrtalama(double n) {
		double harmonicOrtalama = n / harmonicSeri(n);
		return harmonicOrtalama;
	}

}
