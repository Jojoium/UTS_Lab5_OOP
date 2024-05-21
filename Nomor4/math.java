package Nomor4;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Matematika math = new Matematika();
        Fisika fisika = new Fisika();

        while (true) {
            System.out.println("===========================");
            System.out.println("Pilih jenis perhitungan:");
            System.out.println("1. Matematika");
            System.out.println("2. Fisika");
            System.out.println("3. Keluar");
            System.out.println("Masukkan Pilihan:");
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
                System.out.println("Masukkan Pilihan:");
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
                    case 3:
                        System.out.print("Masukkan nilai: ");
                        int nilai = scanner.nextInt();
                        System.out.println("Faktorial: " + math.hitungFaktorial(nilai));
                        break;
                    case 4:
                        System.out.print("Masukkan radius: ");
                        double radius = scanner.nextDouble();
                        System.out.println("Luas Lingkaran: " + math.hitungLuasLingkaran(radius));
                        break;
                    case 5:
                        System.out.print("Masukkan radius: ");
                        radius = scanner.nextDouble();
                        System.out.println("Volume Bola: " + math.hitungVolumeBola(radius));
                        break;
                    case 6:
                        System.out.print("Masukkan alas: ");
                        double alas = scanner.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        double tinggi = scanner.nextDouble();
                        System.out.println("Luas Segitiga: " + math.hitungLuasSegitiga(alas, tinggi));
                        break;
                    case 7:
                        System.out.print("Masukkan radius: ");
                        radius = scanner.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        tinggi = scanner.nextDouble();
                        System.out.println("Volume Kerucut: " + math.hitungVolumeKerucut(radius, tinggi));
                        break;
                    case 8:
                        System.out.print("Masukkan sisi a: ");
                        double a = scanner.nextDouble();
                        System.out.print("Masukkan sisi b: ");
                        double b = scanner.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        tinggi = scanner.nextDouble();
                        System.out.println("Luas Trapesium: " + math.hitungLuasTrapesium(a, b, tinggi));
                        break;
                    case 9:
                        System.out.print("Masukkan base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Masukkan eksponen: ");
                        int eksponen = scanner.nextInt();
                        System.out.println("Eksponen: " + math.hitungEksponen(base, eksponen));
                        break;
                    case 10:
                        System.out.print("Masukkan nilai: ");
                        double value = scanner.nextDouble();
                        System.out.print("Masukkan base: ");
                        base = scanner.nextDouble();
                        System.out.println("Logaritma: " + math.hitungLogaritma(value, base));
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
                System.out.println("Masukkan Pilihan:");
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan jarak (m): ");
                        double jarak = scanner.nextDouble();
                        System.out.print("Masukkan waktu (s): ");
                        double waktu = scanner.nextDouble();
                        System.out.println("Kecepatan: " + fisika.hitungKecepatan(jarak, waktu));
                        break;
                    case 2:
                        System.out.print("Masukkan massa (kg): ");
                        double massa = scanner.nextDouble();
                        System.out.print("Masukkan kecepatan (m/s): ");
                        double kecepatan = scanner.nextDouble();
                        System.out.println("Energi Kinetik: " + fisika.hitungEnergiKinetik(massa, kecepatan));
                        break;
                    case 3:
                        System.out.print("Masukkan massa (kg): ");
                        massa = scanner.nextDouble();
                        System.out.print("Masukkan percepatan (m/s^2): ");
                        double percepatan = scanner.nextDouble();
                        System.out.println("Gaya: " + fisika.hitungGaya(massa, percepatan));
                        break;
                    case 4:
                        System.out.print("Masukkan massa (kg): ");
                        massa = scanner.nextDouble();
                        System.out.print("Masukkan kecepatan (m/s): ");
                        kecepatan = scanner.nextDouble();
                        System.out.println("Momentum: " + fisika.hitungMomentum(massa, kecepatan));
                        break;
                    case 5:
                        System.out.print("Masukkan gaya (N): ");
                        double gaya = scanner.nextDouble();
                        System.out.print("Masukkan luas (m^2): ");
                        double luas = scanner.nextDouble();
                        System.out.println("Tekanan: " + fisika.hitungTekanan(gaya, luas));
                        break;
                    case 6:
                        System.out.print("Masukkan gaya (N): ");
                        gaya = scanner.nextDouble();
                        System.out.print("Masukkan jarak (m): ");
                        jarak = scanner.nextDouble();
                        System.out.println("Usaha: " + fisika.hitungUsaha(gaya, jarak));
                        break;
                    case 7:
                        System.out.print("Masukkan usaha (J): ");
                        double usaha = scanner.nextDouble();
                        System.out.print("Masukkan waktu (s): ");
                        waktu = scanner.nextDouble();
                        System.out.println("Daya: " + fisika.hitungDaya(usaha, waktu));
                        break;
                    case 8:
                        System.out.print("Masukkan massa (kg): ");
                        massa = scanner.nextDouble();
                        System.out.print("Masukkan volume (m^3): ");
                        double volume = scanner.nextDouble();
                        System.out.println("Massa Jenis: " + fisika.hitungMassaJenis(massa, volume));
                        break;
                    case 9:
                        System.out.print("Masukkan kecepatan awal (m/s): ");
                        double kecepatanAwal = scanner.nextDouble();
                        System.out.print("Masukkan kecepatan akhir (m/s): ");
                        double kecepatanAkhir = scanner.nextDouble();
                        System.out.print("Masukkan waktu (s): ");
                        waktu = scanner.nextDouble();
                        System.out.println("Percepatan: " + fisika.hitungPercepatan(kecepatanAwal, kecepatanAkhir, waktu));
                        break;
                    case 10:
                        System.out.print("Masukkan periode (s): ");
                        double periode = scanner.nextDouble();
                        System.out.println("Frekuensi: " + fisika.hitungFrekuensi(periode));
                        break;
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

    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public long hitungFaktorial(int n) {
        if (n <= 1) return 1;
        return n * hitungFaktorial(n - 1);
    }

    public double hitungLuasLingkaran(double radius) {
        return Math.PI * radius * radius;
    }

    public double hitungVolumeBola(double radius) {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public double hitungVolumeKerucut(double radius, double tinggi) {
        return (1.0 / 3) * Math.PI * radius * radius * tinggi;
    }

    public double hitungLuasTrapesium(double a, double b, double tinggi) {
        return 0.5 * (a + b) * tinggi;
    }

    public double hitungEksponen(double base, int eksponen) {
        return Math.pow(base, eksponen);
    }

    public double hitungLogaritma(double value, double base) {
        return Math.log(value) / Math.log(base);
    }
}

class Fisika {
    public Fisika() {}

    public double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu;
    }

    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * kecepatan * kecepatan;
    }

    public double hitungGaya(double massa, double percepatan) {
        return massa * percepatan;
    }

    public double hitungMomentum(double massa, double kecepatan) {
        return massa * kecepatan;
    }

    public double hitungTekanan(double gaya, double luas) {
        return gaya / luas;
    }

    public double hitungUsaha(double gaya, double jarak) {
        return gaya * jarak;
    }

    public double hitungDaya(double usaha, double waktu) {
        return usaha / waktu;
    }

    public double hitungMassaJenis(double massa, double volume) {
        return massa / volume;
    }

    public double hitungPercepatan(double kecepatanAwal, double kecepatanAkhir, double waktu) {
        return (kecepatanAkhir - kecepatanAwal) / waktu;
    }

    public double hitungFrekuensi(double periode) {
        return 1 / periode;
    }
}
