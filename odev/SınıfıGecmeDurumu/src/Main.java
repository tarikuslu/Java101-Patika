import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] notlar = new int[5];
		System.out.println("Matematik notunuzu giriniz: " );
		notlar[0] = scanner.nextInt();
		System.out.println("Fizik notunuzu giriniz: " );
		notlar[1] = scanner.nextInt();
		System.out.println("T�rk�e notunuzu giriniz: " );
		notlar[2] = scanner.nextInt();
		System.out.println("Kimya notunuzu giriniz: " );
		notlar[3] = scanner.nextInt();
		System.out.println("M�zik notunuzu giriniz: " );
		notlar[4] = scanner.nextInt();
		int toplam = 0;
		for ( int not : notlar) {
			if (not >= 0 && not <= 100) {
				toplam += not;
			}
		}
		double ortalama = toplam / notlar.length;
		System.out.println("Notlar ortalamas�: " + ortalama);
		

	}

}
