import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] arr = {15,12,788,1,-1,-778,2,0}; 
		 int buyukEnYakinSayi = 0;
		 int kucukEnYakinSayi = 0;
		 Scanner scanner = new Scanner(System.in);
	 
		 System.out.println("Girilen Say� :");
		 int sayi = scanner.nextInt();
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		 for(int i = 0; i<arr.length; i++) {
			 if (sayi > arr[i]) {
				kucukEnYakinSayi = arr[i];
			} else if (sayi < arr[i]) {
				buyukEnYakinSayi = arr[i];
				break;
			}
		 }
		 
		 System.out.println("Girilen say�dan k���k en yak�n say� :" + kucukEnYakinSayi);
		 System.out.println("Girilen say�dan b�y�k en yak�n say� :" + buyukEnYakinSayi);
	}

}
