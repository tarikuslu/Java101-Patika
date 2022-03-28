import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("taban say� giriniz: ");
		int tabanSayi = scanner.nextInt();
		
		System.out.println("�s giriniz: ");
		int usSayi = scanner.nextInt();
		
		System.out.println(usAlma(tabanSayi, usSayi));
	}

	
	static int usAlma(int taban, int us) {
		if (us == 1) {
			return taban;
		}
		
		return usAlma(taban, us - 1) * taban;
	}
}
