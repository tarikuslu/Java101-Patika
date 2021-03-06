import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
	int rowNumber, colNumber, mineCount, copyOfMineCount;
	
	public MineSweeper(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.mineCount = rowNumber * colNumber / 4;
		copyOfMineCount = this.mineCount;
	}

	char[][] mineArr;
	char[][] mineSpace;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	 void run() {
		 mineArr = new char[rowNumber][colNumber];
		 mineSpace = new char[rowNumber][colNumber];
		for(int i = 0; i<rowNumber; i++) {
			for(int j = 0; j<colNumber; j++) {
					mineArr[i][j] = '-';
			}
		}
		
		for(int i = 0; i<rowNumber; i++) {
			for(int j = 0; j<colNumber; j++) {
					mineSpace[i][j] = '-';
			}
		}
		plantMines(mineArr);
		
		System.out.println("Mayin Tarlasi Oyununa Ho? geldiniz..");
		printCheat(mineArr);
		
		System.out.println("SUANKI DURUM: ");
		printCurrentSituation(mineSpace);
		
		while(!(isWin(mineSpace))) {
			System.out.println("Satir no giriniz..");
			int satir = scan.nextInt();
			System.out.println("Sutun no giriniz..");
			int sutun = scan.nextInt();
			
			if (satir < 0 || satir > mineSpace.length || sutun < 0 || sutun > mineSpace[0].length) {
				System.out.println("Ge?erli bir giri? yap?n?z..");
				continue;
			}
			if (mineSpace[satir][sutun] != '-') {
				System.out.println("Daha once bu degeri yapt?n?z!");
				continue;
			}
			if (mineArr[satir][sutun] == '*') {
				System.out.println("Oyun bitti kaybettiniz!");
				break;
			}
			int REDIX = 10;
			mineSpace[satir][sutun] = Character.forDigit(calcNearMines(satir, sutun, mineArr), REDIX);
			printCurrentSituation(mineSpace);
		}
		
	}
	
	 void plantMines(char [][] mineArr) {
		
		while(mineCount > 0) {
			int randRow = rand.nextInt(this.rowNumber);
			int randCol = rand.nextInt(this.colNumber);
			
			if(mineArr[randRow][randCol] != '*') {
				mineArr[randRow][randCol] = '*';
				mineCount--;
			}
						
		}
	}
	 
	 void printCheat(char[][] mineArr) {
		 System.out.println("MAYINLARIN KONUMU: ");
		 for(int i = 0; i<this.rowNumber; i++) {
				for(int j = 0; j<this.colNumber; j++) {
					System.out.print(mineArr[i][j] + "  ");
				}
				System.out.println();
			}
	 }
	 
	 void printCurrentSituation(char[][] mineArr) {
		 for(int i = 0; i<this.rowNumber; i++) {
				for(int j = 0; j<this.colNumber; j++) {
					System.out.print(mineSpace[i][j] + "  ");
				}
				System.out.println();
			}
	 }
	 
	 int calcNearMines(int satir, int sutun, char[][] mineArr) {
		 int count = 0;
		 
		
		 if( (sutun - 1) >= 0 && mineArr[satir][sutun - 1] == '*') {
			 count++;
		 }
		 if( (sutun + 1) < mineArr[0].length && mineArr[satir][sutun + 1] == '*') {
			 count++;
		 }
		 if((satir - 1) >= 0 && mineArr[satir - 1][sutun] == '*') {
			 count++;
		 }
		 if((satir + 1) < mineArr.length &&  mineArr[satir + 1][sutun] == '*') {
			 count++;
		 }
		 if( (satir - 1) >= 0 && (sutun - 1) >= 0 && mineArr[satir - 1][sutun - 1] == '*') {
			 count++;
		 }
		 if( (satir - 1) >= 0 && (sutun + 1) < mineArr[0].length && mineArr[satir - 1][sutun + 1] == '*') {
			 count++;
		 }
		 if( (satir + 1) < mineArr.length && (sutun - 1) >= 0 && mineArr[satir + 1][sutun - 1] == '*') {
			 count++;
		 }
		 if( (satir + 1) < mineArr.length && (sutun + 1) < mineArr[0].length && mineArr[satir + 1][sutun + 1] == '*') {
			 count++;
		 }
		 
		 
		 return count;
	 }
	 
	 boolean isWin(char[][] mineArr) {
		 int count = 0;
		 
		 for(int i = 0; i< mineArr.length; i++) {
			 for(int j = 0; j<mineArr[0].length; j++) {
				 if (mineArr[i][j] == '-') {
					count++;
				}
			 }
		 }
		 
		 if (count == copyOfMineCount) {
			 System.out.println("Tebrikler Kazand?n?z!");
			return true;
		}
		 return false;
	 }
}