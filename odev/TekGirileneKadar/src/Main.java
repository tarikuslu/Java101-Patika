import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		while (true) {
			System.out.println("Lütfen tek sayý giriniz");
			int sayi = scanner.nextInt();
			if (sayi % 2 == 0 && sayi % 4 == 0) {
				toplam += sayi;
			}
			else if (sayi % 2 != 0) {
				break;
			}
		}
		
		System.out.println("Toplam: " + toplam);
		
	}

}
