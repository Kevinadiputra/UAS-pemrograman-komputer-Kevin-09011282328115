import java.util.Scanner;

public class Soal8 {
    private String username;
    private String password;
    private boolean aktif;

    // Konstruktor untuk inisialisasi akun
    public Soal8(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = false; 
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInformasi() {
        System.out.println("Informasi Akun:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status Aktif: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        if (aktif) {
            System.out.println("Akun ini sudah aktif.");
        } else {
            System.out.println("Akun berhasil diaktifkan.");
            aktif = true;
        }
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        if (!aktif) {
            System.out.println("Akun ini sudah nonaktif.");
        } else {
            System.out.println("Akun berhasil dinonaktifkan.");
            aktif = false;
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas AkunPengguna
        Soal8 akun1 = new Soal8("user123", "password123");
        Soal8 akun2 = new Soal8("john_doe", "securepass");

        // Menampilkan informasi akun
        akun1.tampilkanInformasi();
        System.out.println(); 
        akun2.tampilkanInformasi();

        // Mengaktifkan dan menonaktifkan akun
        akun1.aktifkanAkun();
        System.out.println(); 
        akun1.tampilkanInformasi();

        akun2.nonaktifkanAkun();
        System.out.println(); 
        akun2.tampilkanInformasi();
    }
}
