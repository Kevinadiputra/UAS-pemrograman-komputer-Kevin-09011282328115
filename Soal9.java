import java.util.Stack;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan ekspresi matematika: ");
        String ekspresi = scanner.nextLine();

        // Memanggil metode untuk memeriksa urutan kurung
        if (cekUrutanKurung(ekspresi)) {
            System.out.println("Urutan kurung benar.");
        } else {
            System.out.println("Urutan kurung salah.");
        }

        scanner.close();
    }

    // Metode untuk memeriksa urutan kurung
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            if (karakter == '(' || karakter == '{' || karakter == '[') {
                // Jika karakter adalah kurung buka, push ke stack
                stack.push(karakter);
            } else if (karakter == ')' || karakter == '}' || karakter == ']') {
                // Jika karakter adalah kurung tutup, periksa dengan kurung buka terakhir dalam stack
                if (stack.isEmpty()) {
                    return false; 
                }

                char kurungBuka = stack.pop();
                if (!pasanganKurung(kurungBuka, karakter)) {
                    return false; 
                }
            }
        }

        return stack.isEmpty(); 
    }

    // Metode untuk memeriksa pasangan kurung
    public static boolean pasanganKurung(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
               (buka == '{' && tutup == '}') ||
               (buka == '[' && tutup == ']');
    }
}
