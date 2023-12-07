import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Memanggil metode untuk melakukan operasi sesuai operator
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operator tidak valid");
                System.exit(1);
        }

        // Menampilkan hasil operasi
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }

    // Metode untuk penjumlahan
    public static double tambah(double a, double b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    // Metode untuk perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    // Metode untuk pembagian
    public static double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak diizinkan");
            System.exit(1);
            return 0; 
        }
    }
}
