package Tugas4;

import java.util.Scanner;
import java.util.Random;

public class MainApp {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int angkaTebakan = random.nextInt(TebakAngka_Resouces.BATAS_ATAS) + TebakAngka_Resouces.BATAS_BAWAH; // Angka yang akan ditebak (1 - 100)
        int tebakan = 0; // tebakan
        int percobaan = 0; // percobaan
        boolean jikaKetemu = false; // jika_ketemu

        TebakAngka_Resouces.tampilanPesanPembuka();

        TebakAngka_Resouces.prosesPermainan(jikaKetemu, scanner, percobaan, angkaTebakan);

        scanner.close();
    }
}
