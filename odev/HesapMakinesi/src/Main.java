import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1,n2,select;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�lk say�y� giriniz: ");
		n1 = scanner.nextInt();
		System.out.println("�kinci say�y� giriniz: ");
		n2 = scanner.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.println("Se�iminiz: ");
		select = scanner.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("Toplam: " + (n1 + n2));
			break;
		case 2:
			System.out.println("��karma: " + (n1 - n2));
			break;
		case 3:
			System.out.println("�arpma: " + (n1 * n2));
			break;	
		case 4:
			if (n2 == 0) {
				System.out.println("B�lmede payda 0 olamaz!");
			} else {
				System.out.println("B�lme: " + (n1 / n2));
			}
			break;
		default:
			break;
		}
	}
}
