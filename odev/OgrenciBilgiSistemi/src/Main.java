
public class Main {

	public static void main(String[] args) {
		Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", 50000000, "MAT");
        Teacher t2 = new Teacher("Fatma Ay�e", 0000001, "FZK");
        Teacher t3 = new Teacher("Ali Veli", 50000002, "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("�nek �aban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        
        s1.isPass();

        Student s2 = new Student("G�d�k Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(75,34,80);
        s2.isPass();

        Student s3 = new Student("Hayta �smail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,45,60);
        s3.isPass();

	}

}
