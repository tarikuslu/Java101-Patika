import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("L?tfen say?y? giriniz: ");
		int sayi = scanner.nextInt();
		double toplam = 0;
		for (int i = 1; i <= sayi; i++) {
			toplam += (1d/i);
		}	
		System.out.println(sayi + "'nin harmonik toplam?: " + toplam);	
	}
}
