import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        double totalNilai = 0;

// kode pengulangan
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            
            while (nilai < 0 || nilai > 100) {
                System.out.print("Nilai tidak valid! Masukkan ulang nilai mahasiswa ke-" + i + ": ");
                nilai = scanner.nextDouble();
            }

            totalNilai += nilai; 
        }

// kode menghitung rata" 
        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.printf("\nRata-rata nilai mahasiswa: %.2f\n", rataRata);

// kode penyelesaian kondisi
        if (rataRata >= 70) {
            System.out.println("Hasil: Rata-rata nilai memenuhi standar kelulusan.");
        } else {
            System.out.println("Hasil: Rata-rata nilai tidak memenuhi standar kelulusan.");
        }

    }
}