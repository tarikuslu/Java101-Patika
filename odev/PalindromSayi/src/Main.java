import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz: ");
		int sayi = scanner.nextInt();
		while(sayi > 0) {
			System.out.println(sayi % 10);
			sayi /= 10;
			
		}
		
	}

}
