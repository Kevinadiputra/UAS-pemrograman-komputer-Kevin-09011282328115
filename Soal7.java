import java.util.Scanner;

public class Soal7 {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;
    private String namaPeminjam;
    private String tanggalPeminjaman;

    // Konstruktor untuk inisialisasi buku
    public Soal7(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Awalnya buku belum dipinjam
        this.namaPeminjam = "";
        this.tanggalPeminjaman = "";
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        if (dipinjam) {
            System.out.println("Status Peminjaman: Dipinjam");
            System.out.println("Peminjam: " + namaPeminjam);
            System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman);
        } else {
            System.out.println("Status Peminjaman: Tersedia");
        }
    }

    // Metode untuk meminjam buku
    public void pinjamBuku(String namaPeminjam, String tanggalPeminjaman) {
        if (dipinjam) {
            System.out.println("Buku ini sudah dipinjam oleh " + this.namaPeminjam + ".");
        } else {
            this.namaPeminjam = namaPeminjam;
            this.tanggalPeminjaman = tanggalPeminjaman;
            System.out.println("Anda berhasil meminjam buku.");
            dipinjam = true;
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas BukuPerpustakaan
        Soal7 buku1 = new Soal7("Laskar Pelangi", "Andrea Hirata", 2005);
        Soal7 buku2 = new Soal7("Bumi Manusia", "Pramoedya Ananta Toer", 1980);

        // Menampilkan informasi buku
        buku1.tampilkanInformasi();
        System.out.println(); 
        buku2.tampilkanInformasi();

        // Meminjam buku
        buku1.pinjamBuku("Alisa", "2023-01-15");
        System.out.println(); 
        buku1.tampilkanInformasi();
    }
}
