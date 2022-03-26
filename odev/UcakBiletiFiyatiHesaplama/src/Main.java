import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mesafeyi km t�r�nden giriniz");
		int km = scanner.nextInt();
		while (km <= 0) {
			System.out.println("KM Pozitif bir say� olmal�!");
			km = scanner.nextInt();
		}
		
		System.out.println("Ya��n�z� giriniz");
		int yas = scanner.nextInt();
		while (yas <= 0) {
			System.out.println("Ya� Pozitif bir say� olmal�!");
			yas = scanner.nextInt();
		}
		
		System.out.println("Yolculuk tipini giriniz 1/2");
		int tip = scanner.nextInt();
		while ((tip != 1) && (tip != 2)) {
			System.out.println("Yolculuk tipi 1/2 den baska olamaz");
		tip = scanner.nextInt();
		}
		
		double biletFiyat� = km * 0.10;
		if (yas < 12) {
			biletFiyat� -= biletFiyat� * 0.50;
		} else if (yas >=12 && yas < 24) {
			biletFiyat� -= biletFiyat� * 0.10;
		} else if (yas > 65) {
			biletFiyat� -= biletFiyat� * 0.30;
		} 
		
		if (tip == 2) {
			biletFiyat� -= biletFiyat� * 0.20;
			biletFiyat� = biletFiyat� * 2;
		}
		
		System.out.println("Toplam tutar: " + biletFiyat�);
	}

}
