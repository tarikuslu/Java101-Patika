import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Say�y� giriniz: ");
		int sayi = scanner.nextInt();
		
		int basamak;
		int toplam = 0;
		int temp = sayi;
		
		while (temp != 0) {
			basamak = temp % 10;
			toplam += basamak;
			temp /=10;
		}
		
		System.out.println(sayi + "'n�n basamaklar� toplam�: " + toplam);
	}

}
