import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        // Input jumlah pembelian
        System.out.print("Masukkan jumlah pembelian: ");
        int jumlahPembelian = scanner.nextInt();

        // Hitung diskon berdasarkan jumlah pembelian
        double diskon = 0.0;
        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            diskon = 0.05; 
            System.out.println("Diskon 5% !");
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            diskon = 0.1; 
            System.out.println("Diskon 10% !");
        } else if (jumlahPembelian > 20) {
            diskon = 0.2;
            System.out.println("Diskon 20% !");
        }else{
        	System.out.println("Tidak ada diskon !");
        }

        // Hitung total harga setelah diskon
        double totalHarga = hargaBarang * jumlahPembelian * (1 - diskon);

        // Tampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: Rp " + totalHarga);

        scanner.close();
    }
	
}