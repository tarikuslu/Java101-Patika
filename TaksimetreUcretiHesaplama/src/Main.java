import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double kmUcret = 2.20;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Taksi ile ka� km gidilecek?");
		double km = scanner.nextDouble();
		
		if ((km * kmUcret) + 10 < 20 && (km * kmUcret) + 10 > 0) {
			System.out.println("�denecek �cret 20TL");
		} else if((km * kmUcret) + 10 > 0 && (km * kmUcret) + 10 >= 20) {
			System.out.println("�denecek �cret " + (km * kmUcret + (10)));
		}
	}

}
