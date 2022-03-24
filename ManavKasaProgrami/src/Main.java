import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double armutKg = 2.14;
		double elmaKg = 3.67;
		double domatesKg = 1.11;
		double muzKg = 0.95;
		double patlicanKg = 5.00;
		
		System.out.println("Armut kaç kilo?");
		double alinanArmutKgMiktari = scanner.nextDouble();
		double armutToplam = armutKg * alinanArmutKgMiktari;
		System.out.println("Elma kaç kilo?");
		double alinanElmaKgMiktari = scanner.nextDouble();
		double elmaToplam = elmaKg * alinanElmaKgMiktari;
		System.out.println("Domates kaç kilo?");
		double alinanDomatesKgMiktari = scanner.nextDouble();
		double domatesToplam = domatesKg * alinanDomatesKgMiktari;
		System.out.println("Muz kaç kilo?");
		double alinanMuzKgMiktari = scanner.nextDouble();
		double muzToplam = muzKg * alinanMuzKgMiktari;
		System.out.println("Patlýcan kaç kilo?");
		double alinanPatlicanKgMiktari = scanner.nextDouble();
		double patlicanToplam = patlicanKg * alinanPatlicanKgMiktari;
		
		double toplamTutar = armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam;
		
		System.out.println("Toplam Tutar: " + toplamTutar);
		
	}

}
