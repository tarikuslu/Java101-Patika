import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Say�y� giriniz: ");
		int sayi = scanner.nextInt();
		
		for (int i = 0; i <= sayi; i++) {
			if (Math.pow(4, i) <= sayi && Math.pow(5, i) <= sayi) {
				System.out.println("4'�n kat�: " + Math.pow(4, i));
				System.out.println("5'in kat�: " + Math.pow(5, i));
			}
			
		}

	}

}
