import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayýyý giriniz: ");
		int sayi = scanner.nextInt();
		double faktoriyel = 1;
		for(int i = 1; i<= sayi; i++) {
			faktoriyel *= i;
		}
		System.out.println(sayi + "'nin faktöriyeli: " + faktoriyel);
	}

}
