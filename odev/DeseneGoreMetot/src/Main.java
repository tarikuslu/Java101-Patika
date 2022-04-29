
public class Main {

	public static void main(String[] args) {
	System.out.println(desen(16));
	}
	
	static int desen(int n) {
		if (n == 0) {
			return 0;
		}	else {
			if (desen(n - 5) != 0) {
				System.out.println(n);
				return n;
			} else {
				return 1;
			}
		}
	}

}
