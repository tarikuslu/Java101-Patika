
public class Student {
	
	String name, studentNo;
	int classes;
	Course course1;
	Course course2;
	Course course3;
	double average;
	boolean isPass;
	
	public Student(String name, int classes, String studentNo,  Course course1, Course course2, Course course3) {
		this.name = name;
		this.studentNo = studentNo;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
	}
	
	public void addBulkExamNote(int note1, int note2, int note3) {
		
		if (note1 >= 0 && note1 <= 100) {
			this.course1.note = note1;
		}
		if (note2 >= 0 && note2 <= 100) {
			this.course2.note = note2;
		}
		if (note3 >= 0 && note3 <= 100) {
			this.course3.note = note3;
		}
	}
	
	public void isPass() {
		this.isPass = isCheckPass();
		printNote();
		System.out.println("Ortalamanýz: " + this.average);
		if (isPass) {
			System.out.println("Sýnýfý Geçtiniz!");
		} else {
			System.out.println("Sýnýfta kaldýnýz!");
		}
	}
	
	
	public void calcAverage() {
		this.average = (course1.note + course2.note + course3.note) / 3;
	}
	
	public boolean isCheckPass() {
		calcAverage();
		return this.average > 55;
	}
	
	public void printNote() {
		System.out.println();
	}
}
