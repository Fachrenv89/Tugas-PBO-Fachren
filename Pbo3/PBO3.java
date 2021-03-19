package Pbo3;
import java.time.LocalDateTime;
public class PBO3 {
   public static void main(String[] args) {
        // instances
        Student Fachren  = new Student("Fachren", "2003110385", 150, 80);
        Student Andi     = new Student("Ujang", "2003110385", 190, 50);
        Student Boko     = new Student("Boko", "2003110385", 180, 70);

        // show data per instance
        System.out.println(Fachren.show());
        System.out.println(Andi.show());
        System.out.println(Boko.show());

        // show total Student
        System.out.println("total Student: " + Student.getTotalMahasiswa());
    }
}
    class Student {
        // Class Variables (Static Fields)
    private static int totalMahasiswa = 1;



    // Instance Variables (Non-Static Fields)
    final int id = this.totalMahasiswa;
    String nama;
    String nim;
    double tinggi;
    double berat;
    LocalDateTime createdAt;

    // no args constuctor
    Student(){
        this.totalMahasiswa++;
    }
    
    public Student(String nama,String nim,double tinggi,double berat) {
        this.nama = nama;
        this.nim = nim;
        this.tinggi = tinggi;
        this.berat = berat;
         this.createdAt = LocalDateTime.now();
        this.totalMahasiswa++;
    }

    // static or class method
    public static int getTotalMahasiswa() {
        return totalMahasiswa - 1;
    
}
    // instance methods
    // get ID
    public String getNama() {
        return nama;
    }
    // get NIM
    public String getNim() {
        return nim;
    }
    // get Major
    public double getTinggi() {
        return tinggi;
    }
    // get Email
    public double getBerat() {
        return berat;
    }
     // get CreatedAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    // show data
    public String show() {
        return  "      name  = " + this.nama + "\n" +
                "      nim   = " + this.nim + "\n" +
                "      tinggi = " + this.tinggi + "\n" +
                "      berat = " + this.berat + "\n" +
                "      createdAt = " + this.createdAt + "\n\n";
    }
}
