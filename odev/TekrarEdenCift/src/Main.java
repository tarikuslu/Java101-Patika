import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] list = {2,4,13,45,2,4,35,16,23,14,16};
		int[] duplicateEven = new int[list.length];
		int[] evenList = new int[list.length];
		int startIndex = 0;
		
		for(int i = 0; i<list.length; i++) {
			if (list[i] % 2 == 0) {
				evenList[i] = list[i];
			}
		}
		
		for(int i = 0; i<list.length; i++) {
			for(int j = 0; j<list.length; j++) {
				if ((i != j) && ( list[i] == list[j])) {
					duplicateEven[startIndex++] = list[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(duplicateEven));
			
	}

}
