import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Oyunun satir sayisi?");
		int satir = scanner.nextInt();
		System.out.println("Oyunun sutun sayisi?");
		int sutun = scanner.nextInt();
		MineSweeper mineSweeper = new MineSweeper(satir, sutun);
		
		mineSweeper.run();
	}

}
