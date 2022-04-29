
public class Employee {

	String name;
	int salary;
	int workHours;
	int hireYear;
	int bonus;
	double tax;
	double raisedAmount;
	public Employee(String name, int salary, int workHours, int hireYear) {
	this.name = name;
	this.salary = salary;
	this.workHours = workHours;
	this.hireYear = hireYear;
	}
	
	void tax() {
		if (this.salary < 1000) {
			System.out.println("Vergi yok");
		} else {
			System.out.println("Vergi" + (salary * 0.03));	
			tax = salary * 0.03;
		}	

	}
	
	void bonus() {
		if (this.workHours > 40) {
			System.out.println("Bonus: " + (workHours -40) * 30);
			bonus = (workHours - 40) * 30;
		} else {
			System.out.println("bonus �cret kazanamad�n�z!");
		}
	}
	
	void raiseSalary() {
		int workedYear = 2021 - hireYear;
		if (workedYear < 10) {
			System.out.println("Maa� art��� " + (salary *0.05));
			raisedAmount = salary * 0.05;
		} else if (workedYear> 9 && workedYear < 20) {
			System.out.println("Maa� art��� " + (salary * 0.10));
			raisedAmount = salary * 0.10;
		} else if (workedYear > 19) {
			System.out.println("Maa� art���" + (salary * 0.15));
			raisedAmount = salary * 0.15;
	}
	}
	

	public void toStrings() {
		System.out.println("Ad�: " + this.name);
		System.out.println("Maa��: " + this.salary);
		System.out.println("�al��ma saati: " + this.workHours);
		System.out.println("Ba�lang�� Y�l�: " + this.hireYear);
		System.out.println("Vergi: " + tax);
		System.out.println("Bonus: " + bonus);
		System.out.println("Maa� art���: " + raisedAmount);
		System.out.println("Vergi ve Bonuslar ile birlikte maa� :" + (salary - tax + bonus));
		System.out.println("Toplam Maa� :" + (salary + raisedAmount));
	}
}
