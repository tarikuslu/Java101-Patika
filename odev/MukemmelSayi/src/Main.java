import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Say� giriniz: ");
		int sayi = scanner.nextInt();
		int toplam = 0;
		for(int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (toplam == sayi) {
			System.out.println(sayi + " M�kemmel say�d�r");
		} else {
			System.out.println(sayi + " M�kemmel say� de�ildir");
		}

	}

}
