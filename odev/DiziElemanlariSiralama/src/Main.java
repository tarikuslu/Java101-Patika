import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dizinin boyutu n :");
		int sayi = scanner.nextInt();
		
		int[] arr = new int[sayi];
		
		System.out.println("Dizinin elemanlarýný giriniz :");
		for(int i = 0; i<arr.length; i++) {
			System.out.println((i + 1) +". Elemaný: " );
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Sýralama: " + Arrays.toString(arr));
	}

}
