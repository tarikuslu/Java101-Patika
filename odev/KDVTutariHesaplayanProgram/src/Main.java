import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen �r�n�n br�t fiyat�n� giriniz...");
		double fiyat = scanner.nextInt();
		double kdvliFiyat;
		double kdvTutari;
		if (fiyat <= 1000 && fiyat > 0) {
			 kdvliFiyat = fiyat * 1.18;
			 kdvTutari = kdvliFiyat - fiyat;
		} else {
			 kdvliFiyat = fiyat * 1.08;
			 kdvTutari = kdvliFiyat - fiyat;
		}	
		System.out.println("�r�n�n KDV eklenmi� fiyat�: " + kdvliFiyat + " ~ " + " KDV tutar�: " + kdvTutari );
	}
}
