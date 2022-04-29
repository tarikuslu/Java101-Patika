
public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Mehmet", 5000, 45, 2021);
		emp1.tax();
		emp1.bonus();
		emp1.raiseSalary();
		System.out.println("-----------------------------");
		emp1.toStrings();

	}

}
