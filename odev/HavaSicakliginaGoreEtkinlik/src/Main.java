import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hava s�cakl���n� giriniz: (santigrat)");
		double havaSicakligi = scanner.nextDouble();
		
		if (havaSicakligi >= 15 && havaSicakligi <= 25) {
			if (havaSicakligi >= 5 && havaSicakligi <= 15) {
				System.out.println("Sinema Etkinli�i");
			} else {
				System.out.println("Piknik Etkinli�i");
			}
		} else if (havaSicakligi > 25) {
			System.out.println("Y�zme Etkinli�i");
		} else {
			System.out.println("Kayak Etkinli�i");
		}
		
	}

}
