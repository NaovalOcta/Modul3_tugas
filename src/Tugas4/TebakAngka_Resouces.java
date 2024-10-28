package Tugas4;

import java.util.Scanner;

public class TebakAngka_Resouces {

    public static final int BATAS_ATAS = 100;
    public static final int BATAS_BAWAH = 1;

    static void prosesPermainan(boolean ktm, Scanner scanner, int perc, int angkaTebakan) {
        int tebakan;
        while (!ktm) {
            tebakan = getTebakanUser(scanner);
            perc++;

            ktm = logikaPermainan(ktm, perc, angkaTebakan, tebakan);
        }
    }

    /**
     *
     * @param scanner
     * @return
     */
    private static int getTebakanUser(Scanner scanner) {
        System.out.print("Masukkan tebakan Anda: ");
        return scanner.nextInt();
    }

    /**
     *
     * @param ktm
     * @param perc
     * @param angkaTebakan
     * @param tbk
     * @return
     */
    private static boolean logikaPermainan(boolean ktm, int perc, int angkaTebakan, int tbk) {

        if (tbk == angkaTebakan) {
            ktm = true;
            System.out.println("Selamat! Anda berhasil menebak angkanya dalam " + perc + " percobaan.");
        } else if (tbk < angkaTebakan) {
            System.out.println("Tebakan Anda terlalu kecil, coba lagi!");
        } else {
            System.out.println("Tebakan Anda terlalu besar, coba lagi!");
        }
        return ktm;
    }

    static void tampilanPesanPembuka() {
        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih sebuah angka antara 1 hingga 100.");
        System.out.println("Coba tebak angka tersebut!");
    }
}
