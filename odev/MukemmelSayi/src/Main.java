import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayý giriniz: ");
		int sayi = scanner.nextInt();
		int toplam = 0;
		for(int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (toplam == sayi) {
			System.out.println(sayi + " Mükemmel sayýdýr");
		} else {
			System.out.println(sayi + " Mükemmel sayý deðildir");
		}

	}

}
