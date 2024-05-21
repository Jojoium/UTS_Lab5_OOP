import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Matematika math = new Matematika();
        Fisika fisika = new Fisika();

        while (true) {
            System.out.println("Pilih jenis perhitungan:");
            System.out.println("1. Matematika");
            System.out.println("2. Fisika");
            System.out.println("3. Keluar");
            int jenis = scanner.nextInt();

            if (jenis == 3) {
                System.out.println("Terima kasih!");
                break;
            }

            if (jenis == 1) {
                System.out.println("Pilih rumus matematika:");
                System.out.println("1. Luas Persegi");
                System.out.println("2. Volume Kubus");
                System.out.println("3. Faktorial");
                System.out.println("4. Luas Lingkaran");
                System.out.println("5. Volume Bola");
                System.out.println("6. Luas Segitiga");
                System.out.println("7. Volume Kerucut");
                System.out.println("8. Luas Trapesium");
                System.out.println("9. Eksponen");
                System.out.println("10. Logaritma");
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan sisi: ");
                        double sisi = scanner.nextDouble();
                        System.out.println("Luas Persegi: " + math.hitungLuas(sisi));
                        break;
                    case 2:
                        System.out.print("Masukkan sisi: ");
                        sisi = scanner.nextDouble();
                        System.out.println("Volume Kubus: " + math.hitungVolume(sisi));
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } else if (jenis == 2) {
                System.out.println("Pilih rumus fisika:");
                System.out.println("1. Kecepatan");
                System.out.println("2. Energi Kinetik");
                System.out.println("3. Gaya");
                System.out.println("4. Momentum");
                System.out.println("5. Tekanan");
                System.out.println("6. Usaha");
                System.out.println("7. Daya");
                System.out.println("8. Massa Jenis");
                System.out.println("9. Percepatan");
                System.out.println("10. Frekuensi");
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}

class Matematika {
    public Matematika() {}

    public double hitungLuas(double sisi) {
        return sisi * sisi;
    }



}

class Fisika {
    public Fisika() {}


}
