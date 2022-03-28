import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
	
		System.out.println(isPrime(sayi, 2) ? "asal" : "asal değil");
	}

	
	static boolean isPrime(int number,int i){
        if(i>=number){
            return true;
        }
       if(number%i==0){
           return false;
       }
       else return isPrime(number,i+1);
    }
}

