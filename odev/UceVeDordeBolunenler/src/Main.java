import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("L?tfen say?y? giriniz");
		int sayi = scanner.nextInt();
		int toplam = 0;
		int adet = 0;
		for (int i = 0; i <= sayi; i++) {
			if (i == 0) {
				continue;
			}
			
			if (i % 3 == 0 && i % 4 == 0) {
				toplam += i;
				adet++;
			}
		}
		double ortalama = toplam / adet;
		
		System.out.println("Ortalama: " + ortalama);
	}

}
