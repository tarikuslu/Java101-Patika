import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz: ");
		int sayi = scanner.nextInt();
		int temp = sayi;
		int temp2 = 1;
		for(int i = 0; i < sayi; i=i+2) {
			while(temp != 0) {
				System.out.print(" ".repeat(temp));
				temp--;
				break;
			}
			for(int j = 0; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = sayi -2 ; i > 0; i=i-2) {
			while(temp <= sayi) {
				System.out.print(" ".repeat(temp + 2));
				temp++;
				break;
			}
			
			for(int j = sayi; j > sayi - i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
