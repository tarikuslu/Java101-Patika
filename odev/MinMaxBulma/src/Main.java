import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ka? adet say? gireceksiniz? ");
		int adet = scanner.nextInt();
		int buyuk = 0;
		int kucuk = 0;
		for(int i = 1; i<=adet; i++) {
			System.out.println(i + ". say?y? giriniz: ");
			int giris = scanner.nextInt();
			
			if (i == 1) {
				kucuk = giris;
			} else {
				if (giris > buyuk) {
					buyuk = giris;
				} else if( giris < kucuk) {
					kucuk = giris;
				}
			}
		}
		
		System.out.println("buyuk: " + buyuk);
		System.out.println("kucuk: " + kucuk);

	}

}
