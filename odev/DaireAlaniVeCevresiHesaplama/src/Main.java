import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		final double PI = 3.14;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dairenin yar��ap�n� giriniz: ");
		double yaricap = scanner.nextDouble();
		
		System.out.println("Merkez a��s� �l��s�n� giriniz: ");
		double merkezAci = scanner.nextDouble();
		
		double merkezAciliAlan = (PI * Math.pow(yaricap, 2) * merkezAci) / 360;
		
		System.out.println("Merkez a��l� form�l kullan�larak alan sonucu: " + merkezAciliAlan);
		
	}

}
