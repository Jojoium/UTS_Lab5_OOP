import java.util.Scanner;

// Kelas utama
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Kucing dengan menggunakan konstruktor
        System.out.println("Masukkan nama kucing: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan umur kucing: ");
        int umur = scanner.nextInt();

        // Membuat objek Kucing dengan konstruktor
        Kucing kucing = new Kucing(nama, umur);

        // Menampilkan informasi kucing
        kucing.displayInfo();

        // Menggunakan setter untuk memperbarui umur kucing
        System.out.println("Masukkan umur baru kucing: ");
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

    // Konstruktor
    public Kucing(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Setter untuk umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method untuk menampilkan informasi kucing
    public void displayInfo() {
        System.out.println("Nama Kucing: " + nama);
        System.out.println("Umur Kucing: " + umur + " tahun");
    }

    // Overloading method displayInfo untuk menampilkan pesan tambahan
    public void displayInfo(String pesanTambahan) {
        System.out.println("Nama Kucing: " + nama);
        System.out.println("Umur Kucing: " + umur + " tahun");
        System.out.println(pesanTambahan);
    }
}

// Kelas KucingAnggora yang mengoverride method displayInfo
class KucingAnggora extends Kucing {
    private String warnaBulu;

    public KucingAnggora(String nama, int umur, String warnaBulu) {
        super(nama, umur); // Memanggil konstruktor superclass
        this.warnaBulu = warnaBulu;
    }

    // Overriding method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method displayInfo dari superclass
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
