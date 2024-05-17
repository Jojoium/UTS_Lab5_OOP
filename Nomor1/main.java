import java.util.Scanner;

// Kelas utama
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.println("Masukkan nama kucing: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan umur kucing: ");
        int umur = scanner.nextInt();
        scanner.nextLine();  // Mengonsumsi newline

        System.out.println("Masukkan warna kucing: ");
        String warna = scanner.nextLine();

        System.out.println("Masukkan jenis kelamin kucing (Jantan/Betina): ");
        String jenisKelamin = scanner.nextLine();

        System.out.println("Masukkan berat kucing (dalam kg): ");
        double berat = scanner.nextDouble();

        // Membuat objek Kucing dengan konstruktor
        Kucing kucing = new Kucing(nama, umur, warna, jenisKelamin, berat);

        // Menampilkan informasi kucing
        kucing.displayInfo();

        // Menggunakan setter untuk memperbarui umur kucing
        System.out.println("\nMasukkan umur baru kucing: ");
        int umurBaru = scanner.nextInt();
        kucing.setUmur(umurBaru);

        // Menampilkan informasi kucing setelah diperbarui
        kucing.displayInfo();
    }
}

// Kelas Kucing
class Kucing {
    // Variabel instance
    private String nama;
    private int umur;
    private String warna;
    private String jenisKelamin;
    private double berat;

    // Konstruktor
    public Kucing(String nama, int umur, String warna, String jenisKelamin, double berat) {
        this.nama = nama;
        this.umur = umur;
        this.warna = warna;
        this.jenisKelamin = jenisKelamin;
        this.berat = berat;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Getter dan Setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter untuk jenisKelamin
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Getter dan Setter untuk berat
    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    // Method untuk menampilkan informasi kucing
    public void displayInfo() {
        System.out.println("Nama Kucing: " + nama);
        System.out.println("Umur Kucing: " + umur + " tahun");
        System.out.println("Warna Kucing: " + warna);
        System.out.println("Jenis Kelamin Kucing: " + jenisKelamin);
        System.out.println("Berat Kucing: " + berat + " kg");
    }

    // Overloading method displayInfo untuk menampilkan pesan tambahan
    public void displayInfo(String pesanTambahan) {
        System.out.println("Nama Kucing: " + nama);
        System.out.println("Umur Kucing: " + umur + " tahun");
        System.out.println("Warna Kucing: " + warna);
        System.out.println("Jenis Kelamin Kucing: " + jenisKelamin);
        System.out.println("Berat Kucing: " + berat + " kg");
        System.out.println(pesanTambahan);
    }
}

// Kelas KucingAnggora yang mengoverride method displayInfo
class KucingAnggora extends Kucing {
    private String warnaBulu;

    public KucingAnggora(String nama, int umur, String warna, String jenisKelamin, double berat, String warnaBulu) {
        super(nama, umur, warna, jenisKelamin, berat); // Memanggil konstruktor superclass
        this.warnaBulu = warnaBulu;
    }

    // Overriding method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method displayInfo dari superclass
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}


//        Class dan Object: Untuk mendefinisikan struktur dan perilaku kucing dan memungkinkan pembuatan objek kucing yang spesifik.
//        Constructor: Untuk memastikan bahwa objek kucing diinisialisasi dengan benar saat dibuat.
//        Method Overloading: Untuk memberikan fleksibilitas dalam menampilkan informasi kucing dengan atau tanpa pesan tambahan.
//        Method Overriding: Untuk memungkinkan subclass (KucingAnggora) menyediakan implementasi khusus dari method yang sudah ada di superclass (Kucing).
//        Setter dan Getter: Untuk mengontrol akses ke atribut kelas dan memastikan enkapsulasi.