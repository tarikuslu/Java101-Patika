import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username, password;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kullanýcý adýnýz: ");
		username = scanner.nextLine();
		
		System.out.println("Þifreniz: ");
		password = scanner.nextLine();
	
		
		if (username.equals("patika") && password.equals("java123")) {
			System.out.println("Giriþ yaptýnýz!");
		} else {
			System.out.println("Yanlýþ bilgi girdiniz þifrenizi sýfýrlamak ister misiniz?(evet/hayýr) ");
			String cevap = scanner.nextLine();
			if (cevap.equals("evet")) {
				System.out.println("Yeni þifrenizi giriniz: ");
				String yeniSifre = scanner.nextLine();
				if (yeniSifre.equals(password)) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				} else {
					System.out.println("Þifre oluþturuldu");
				}
			} else if(cevap.equals("hayýr")) {
				System.out.println("Þifre yenilememe tercih ettiniz, iyi günler");
			} else {
				System.out.println("lütfen sadece evet veya hayýr olarak cevap verin.");
			}
			
			
		}
	}

}
