import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi1, sayi2, sayi3;
		
		System.out.println("Say� 1'i giriniz");
		sayi1 = scanner.nextInt();
		
		System.out.println("Say� 2'i giriniz");
		sayi2 = scanner.nextInt();
		
		System.out.println("Say� 3'i giriniz");
		sayi3 = scanner.nextInt();
		
		if (sayi1 > sayi2 && sayi1 > sayi3) {
			if (sayi1 == sayi2) {
				System.out.println("sayi1=sayi2 >sayi3");
			} else if (sayi1 == sayi3) {
				System.out.println("sayi1=sayi3>sayi2");
			}
			  else if (sayi2 > sayi3) {
				System.out.println("sayi1>sayi2>sayi3");
			} else {
				System.out.println("sayi1>sayi3>sayi2");
			}
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			if (sayi2 == sayi1) {
				System.out.println("sayi2=sayi1 >sayi3");
			} else if (sayi2 == sayi3) {
				System.out.println("sayi2=sayi3>sayi1");
			}
			  else if (sayi1 > sayi3) {
				System.out.println("sayi2>sayi1>sayi3");
			} else {
				System.out.println("sayi2>sayi3>sayi2");
			}
		} else {
			if (sayi3 == sayi1) {
				System.out.println("sayi3=sayi1 >sayi2");
			} else if (sayi3 == sayi2) {
				System.out.println("sayi3=sayi2>sayi1");
			}
			else if (sayi1 > sayi2) {
				System.out.println("sayi3>sayi1>sayi2");
			} else {
				System.out.println("sayi3>sayi2>sayi1");
			}
		}
	}

}
