import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Say? giriniz");
		int sayi = scanner.nextInt();
		int s1 = 0;
		int s2 = 1;
		int s3;
		for(int i = 0; i<sayi; i++) {
			if (i == 0) {
				System.out.print(i + " " + (i+1) + " " );
			} else {
				s3 = s1 + s2;
				s1 = s2;
				s2 = s3;
				System.out.print(s3 + " ");
			}
			
			}
	}

}
