# Tebak Angka

Aplikasi permainan **Tebak Angka** ini adalah permainan sederhana yang menantang pemain untuk menebak angka yang telah dipilih secara acak oleh komputer dalam rentang angka 1 hingga 100. Setiap kali pemain memasukkan tebakan, aplikasi akan memberikan petunjuk apakah angka tebakan tersebut terlalu besar atau terlalu kecil hingga pemain berhasil menebak angka dengan benar.

## Deskripsi Proyek

- Proyek ini terdiri dari dua file Java utama:
    - **TebakAngka_Resouces.java**: Berisi logika permainan, termasuk metode untuk menerima tebakan pengguna dan memberikan umpan balik berdasarkan tebakan tersebut.
    - **MainApp.java**: Menyediakan metode `main` yang menginisialisasi permainan, menghasilkan angka acak, dan memulai proses permainan.

## Cara Menjalankan Proyek

1. **Buka Command Prompt**
    - Tekan Windows + R, ketik `cmd`, lalu tekan Enter.
   ```bash
     cmd
   ```
2. Arahkan ke Drive Proyek Anda:
    - Sebagai contoh, jika lokasi proyek Anda berada di drive D. Jadi, jika saat ini Anda berada di drive C, ketik perintah `D:` dan tekan Enter
   ```bash
     D:
   ```
3. Navigasi ke Folder Proyek
    - Masukkan perintah `cd D:\Documents\Data\Kuliah\05 Semester 3\Praktikum Pemrograman Lanjut\Tugas\Modul 2\"Restaurant Food Ordering Receipt"` untuk berpindah ke folder proyek
   ```bash
     cd D:\Documents\Data\Kuliah\05 Semester 3\Praktikum Pemrograman Lanjut\Tugas\Modul 2\"Restaurant Food Ordering Receipt"
   ```
    - Pastikan menggunakan tanda kutip jika nama folder mengandung spasi seperti pada nama Restaurant Food Ordering Receipt.
    - Alamat file atau path file diatas merupakan contoh, bisa disesuaikan dengan tempat dimana file diletakkan atau disimpan/
4. Masuk ke Folder `src` untuk Mengompilasi Program
    - Pindah saja ke folder src menggunakan perintah `cd src`.
   ```bash
     cd src
   ```
5. Kompilasi Program
    - Untuk mengompilasi semua file .java di dalam folder src, ketik: `javac *.java`.
   ```bash
     javac *.java
   ```
6. Menjalankan Program
    - Setelah berhasil dikompilasi, maka selanjutnya jalankan program dengan memanggil kelas utama dengan perintah `java MainApp`.
   ```bash
     javaa MainApp
   ```

## Cara Bermain
- Program akan menampilkan pesan pembuka, memberi tahu bahwa angka telah dipilih antara 1 dan 100.
- Pengguna akan diminta memasukkan tebakan angka, dan program akan memberikan petunjuk apakah angka yang dimasukkan terlalu kecil atau terlalu besar.
- Permainan akan berlanjut hingga pengguna berhasil menebak angka yang benar.
- Setelah angka berhasil ditebak, program akan menampilkan jumlah percobaan yang dibutuhkan untuk menebak dengan benar.

## Struktur Kode

- **TebakAngka_Resouces.java**
    - `prosesPermainan`: Metode utama yang mengelola logika permainan hingga pemain berhasil menebak angka.
    - `getTebakanUser`: Mengambil input tebakan dari pengguna.
    - `logikaPermainan`: Memeriksa tebakan pengguna dan memberikan umpan balik sesuai dengan angka acak yang ditetapkan.
    - `tampilanPesanPembuka`: Menampilkan pesan pembuka untuk memperkenalkan permainan.

- **MainApp.java**
    - `main`: Inisialisasi permainan, menentukan angka acak yang akan ditebak, dan memulai metode `prosesPermainan`.

## Informasi Tambahan

- **Batas Tebakan**: Angka acak yang dihasilkan berada di antara 1 hingga 100, sebagaimana ditetapkan di variabel `BATAS_BAWAH` dan `BATAS_ATAS` dalam kelas `TebakAngka_Resouces`.
- **Perulangan Permainan**: Jika tebakan tidak sesuai, pengguna akan terus diminta untuk memasukkan tebakan hingga menemukan angka yang benar.
- **Dependency**: Proyek ini hanya bergantung pada pustaka standar Java (`java.util.Scanner` dan `java.util.Random`) dan tidak memerlukan pustaka tambahan.

Selamat bermain dan selamat mencoba menebak angka dengan jumlah percobaan sesedikit mungkin!
****