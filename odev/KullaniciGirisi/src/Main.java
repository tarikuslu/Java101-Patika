import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username, password;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kullan�c� ad�n�z: ");
		username = scanner.nextLine();
		
		System.out.println("�ifreniz: ");
		password = scanner.nextLine();
	
		
		if (username.equals("patika") && password.equals("java123")) {
			System.out.println("Giri� yapt�n�z!");
		} else {
			System.out.println("Yanl�� bilgi girdiniz �ifrenizi s�f�rlamak ister misiniz?(evet/hay�r) ");
			String cevap = scanner.nextLine();
			if (cevap.equals("evet")) {
				System.out.println("Yeni �ifrenizi giriniz: ");
				String yeniSifre = scanner.nextLine();
				if (yeniSifre.equals(password)) {
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				} else {
					System.out.println("�ifre olu�turuldu");
				}
			} else if(cevap.equals("hay�r")) {
				System.out.println("�ifre yenilememe tercih ettiniz, iyi g�nler");
			} else {
				System.out.println("l�tfen sadece evet veya hay�r olarak cevap verin.");
			}
			
			
		}
	}

}
