import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Menampilkan hasil faktorisasi
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);

        // Menutup scanner
        scanner.close();
    }

    // Fungsi untuk memfaktorisasi bilangan
    public static void faktorisasi(int n) {
        // Menampilkan faktor 2 selama n habis dibagi 2
        while (n % 2 == 0) {
            System.out.print("2");
            n = n / 2;
            if (n > 1) {
                System.out.print("*");
            }
        }

        // Mencari faktor-faktor lainnya
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            while (n % i == 0) {
                System.out.print(i);
                n = n / i;
                if (n > 1) {
                    System.out.print("*");
                }
            }
        }

        // Menampilkan faktor terakhir jika n > 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}
