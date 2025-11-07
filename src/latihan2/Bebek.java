package latihan2;

// Implementasikan class Bebek implements Terbang, Berenang
// Multiple inheritance!
public class Bebek implements Terbang, Berenang {
     private String nama;
     private int kecepatan;

    // Constructor
     public Bebek(String nama, int kecepatan) {
         this.nama = nama;
         this.kecepatan = kecepatan;
     }

    // Implementasi SEMUA method dari KEDUA interface
    // Dari interface Terbang:
     @Override public void lepasLandas(){}
     @Override public void terbang(){}
     @Override public void mendarat(){}

    // Dari interface Berenang:
     @Override public void berenang(){}
     @Override public void menyelam(){}
}
