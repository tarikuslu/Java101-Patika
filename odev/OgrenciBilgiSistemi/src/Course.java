
public class Course {
Teacher teacher;
String name;
String code;
String prefix;
int note;

 public Course(String name, String code, String prefix) {
	 this.name = name;
	 this.code = code;
	 this.prefix = prefix;
	 this.teacher = teacher;
	 this.note = 0;
 } 
 
 
 public void addTeacher(Teacher tch) {
	 if (this.prefix.equals(tch.branch)) {
		this.teacher = tch;
	} else {
		System.out.println("Öðretmen - ders uyuþmuyor!");
	}
 }
 
 public void printTeacher() {
	 System.out.println(this.name + "dersinin öðretmeni: " + this.teacher.name);
  }
 
}