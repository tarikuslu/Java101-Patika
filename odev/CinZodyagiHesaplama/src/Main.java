import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do�um y�l�n�z� giriniz: ");
		int dogumYili = scanner.nextInt();
		
		int kalan = dogumYili % 12;
		String zodyak = "";
		switch (kalan) {
		case 0:
			zodyak = "Maymun";
			break;
		case 1:
			zodyak = "Horoz";
			break;
		case 2:
			zodyak = "K�pek";
			break;
		case 3:
			zodyak = "Domuz";
			break;
		case 4:
			zodyak = "Fare";
			break;
		case 5:
			zodyak = "�k�z";
			break;
		case 6:
			zodyak = "Kaplan";
			break;
		case 7:
			zodyak = "Tav�an";
			break;
		case 8:
			zodyak = "Ejderha";
			break;
		case 9:
			zodyak = "Y�lan";
			break;
		case 10:
			zodyak = "At";
			break;
		case 11:
			zodyak = "Koyun";
			break;
		case 12:
			zodyak = "Maymun";
			break;

		default:
			System.out.println("Yanl�� giri� yapt�n�z!");
			break;
		}

		
		System.out.println("�in zodya�� burcunuz: " + zodyak);
	}

}
