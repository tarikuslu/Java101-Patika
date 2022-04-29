
public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(double mat, double fizik, double kimya) {

        if ((mat >= 0 && mat <= 100) ) {
            this.mat.note = mat;
        }

        if ((fizik >= 0 && fizik <= 100) ) {
            this.fizik.note = fizik;
        }

        if ((kimya >= 0 && kimya <= 100) ) {
            this.kimya.note = kimya;
        }

    }
    
    public void addSozluNote(double matSozlu, double fizikSozlu, double kimyaSozlu) {
    	 if ((this.mat.sozlu >= 0 && this.mat.sozlu <= 100) ) {
             this.mat.sozlu = matSozlu;
         }

         if ((this.fizik.sozlu >= 0 && this.fizik.sozlu <= 100) ) {
             this.fizik.sozlu = fizikSozlu;
         }

         if ((this.kimya.sozlu >= 0 && this.kimya.sozlu <= 100) ) {
             this.kimya.sozlu = kimyaSozlu;
         }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.mat.sozlu == 0 || this.fizik.note == 0 || this.fizik.sozlu == 0 || this.kimya.note == 0 || this.kimya.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.8 + this.fizik.sozlu * 0.2) + (this.kimya.note * 0.8 + this.kimya.sozlu * 0.2) + ( this.mat.note * 0.8 + this.mat.sozlu * 0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu : " + this.mat.sozlu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu : " + this.fizik.sozlu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu : " + this.kimya.sozlu);
    }

}