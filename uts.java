import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih Metode Pembayaran:");
        System.out.println("1. Kartu Kredit");
        System.out.println("2. Transfer Bank");
        System.out.println("3. Dompet Digital");
        System.out.print("Masukkan Pilihan Metode Pembayaran (1-3): ");
        int metode = input.nextInt();
        
        switch (metode) {
            case 1: 
                System.out.print("Masukkan Nama Kartu Kredit: ");
                String namaKartu = input.next();
                
                System.out.print("Masukkan Masa Berlaku Kartu Kredit (MM/YY): ");
                String masaBerlaku = input.next();
                
                System.out.print("Masukkan Jumlah Bayar: ");
                int jumlahBayarKartu = input.nextInt();
                
                System.out.print("Masukkan Nomor CVV: ");
                int cvv = input.nextInt();
                
                System.out.println("Pembayaran senilai Rp."+ jumlahBayarKartu +" menggunakan kartu kredit berhasil.");
                break;
                
            case 2: 
                System.out.print("Masukkan Nama Bank Tujuan: ");
                String namaBank = input.next();
                
                System.out.print("Masukkan Nomor Rekening Tujuan: ");
                String nomorRekening = input.next();
                
                System.out.print("Masukkan Jumlah Transfer: ");
                int jumlahTransfer = input.nextInt();
                
                
                System.out.println("Pembayaran senilai Rp."+ jumlahTransfer +" menggunakan transfer bank berhasil.");
                break;
                
            case 3:
                System.out.print("Masukkan jumlah bayar: ");
                int jumlahBayarDompet = input.nextInt();
                
                int saldoPengguna = 1000000; 
                
                if (jumlahBayarDompet <= saldoPengguna) {
                    System.out.println("Pembayaran senilai Rp."+ jumlahBayarDompet +" menggunakan dompet digital berhasil.");
                } else {
                    System.out.println("Maaf, Saldo Anda tidak mencukupi. Pembayaran menggunakan dompet digital gagal.");
                }
                break;
                
            default:
                System.out.println("Metode pembayaran tidak valid.");
        }
        
        input.close();
    }
}
