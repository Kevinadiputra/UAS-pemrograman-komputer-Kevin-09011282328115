import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Memanggil metode untuk melakukan pengecekan palindrom
        if (isPalindrom(input)) {
            System.out.println("'" + input + "' adalah palindrom");
        } else {
            System.out.println("'" + input + "' bukan palindrom");
        }

        scanner.close();
    }

    // Metode untuk mengecek apakah suatu kata atau frase adalah palindrom
    public static boolean isPalindrom(String str) {
        // Menghilangkan spasi dan mengubah semua huruf menjadi huruf kecil
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

        // Mengecek palindrom
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
