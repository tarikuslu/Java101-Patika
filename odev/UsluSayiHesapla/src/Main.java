import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("L�tfen taban say�y� giriniz: ");
		int taban = scanner.nextInt();
		int tabanCopy = taban;
		System.out.println("L�tfen tavan say�y� giriniz: ");
		int tavan = scanner.nextInt();
		
		for (int i = 1; i < tavan; i++) {
			taban *= tabanCopy;
		}	
		System.out.println("�ss�: " + taban);	
	}

}
