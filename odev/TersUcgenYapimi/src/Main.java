import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Basamak say?s?n? giriniz");
		int basamakSayisi = scanner.nextInt();
		int k = 0;
		for(int i = 0; i < basamakSayisi; i++) {
			while(k < basamakSayisi) {
				System.out.print(" ".repeat(k));
				k++;
				break;
			}	
			
			for(int j = 0; j < (basamakSayisi - i) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
