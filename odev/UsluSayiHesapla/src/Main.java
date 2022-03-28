import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen taban sayýyý giriniz: ");
		int taban = scanner.nextInt();
		int tabanCopy = taban;
		System.out.println("Lütfen tavan sayýyý giriniz: ");
		int tavan = scanner.nextInt();
		
		for (int i = 1; i < tavan; i++) {
			taban *= tabanCopy;
		}	
		System.out.println("üssü: " + taban);	
	}

}
