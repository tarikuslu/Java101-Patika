import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("L�tfen fizik notunuzu giriniz");
		int fizikNotu = scanner.nextInt();
		
		System.out.println("L�tfen kimya notunuzu giriniz");
		int kimyaNotu = scanner.nextInt();
		
		System.out.println("L�tfen T�rk�e notunuzu giriniz");
		int turkceNotu = scanner.nextInt();
		
		System.out.println("L�tfen tarih notunuzu giriniz");
		int tarihNotu = scanner.nextInt();
		
		System.out.println("L�tfen m�zik notunuzu giriniz");
		int muzikNotu = scanner.nextInt();

		int toplamNot = fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu;
		double ortalamaNot = toplamNot / 5;
		
		System.out.println("S�nav notlar� ortalamas�:" + ortalamaNot);
		
		String gectiMi = ortalamaNot > 60 ? "S�n�f� ge�ti" : "S�n�fta kald�";
		System.out.println(gectiMi);
	}

}
