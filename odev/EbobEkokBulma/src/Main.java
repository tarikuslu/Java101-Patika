import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. say?y? giriniz: ");
		int sayi1 = scanner.nextInt();
		
		System.out.println("2. say?y? giriniz: ");
		int sayi2 = scanner.nextInt();
		int i = 1;
		int temp = 0;
		while(i <= sayi1 && i <= sayi2) {
			if (sayi1 % i == 0 && sayi2 % i == 0) {
				if (i == 1) {
					temp = i;
				} else {
					if (i >= temp) {
						temp = i;
					}
				}
			}
			i++;
		}
		
		int ekok = (sayi1 * sayi2) / temp;
		
		System.out.println("EBOB: " + temp + " " + "EKOK: " + ekok);
	}

}
