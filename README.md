# Project UAS Android Studio

```
Nama            : Liskania Aprilia
Kelas           : TI.22.A4
NIM             : 312210383
Mata Kuliah     : Pemrograman Mobile (UAS)
Dosen Pengampu  : Donny Maulana, S.Kom., M.M.S.I
```

# Tyrell's App

Tyrell's App merupakan sebuah Aplikasi yang dibuat di Android Studio yang mencakup banyak Project, diantaranya yaitu :

1. Project Hello World
2. Project Count
3. Project News
4. Project Alarm
5. Project Fibonacci
6. Project Chat
7. Project Maps
8. Project Movie

## Project Hello

Metode Utama:

- `onCreate`: Menginisialisasi dan menetapkan tata letak (layout) dengan menggunakan `setContentView`.

Fungsi Utama:
Menampilkan Layout:

- Kode ini bertujuan untuk menampilkan layout dengan nama `activity_hello` ke pengguna.

Catatan:

- Kode ini adalah contoh sederhana dari sebuah aktivitas di Android yang menggunakan layout untuk menampilkan antarmuka pengguna.
- Aktivitas ini tidak memiliki interaksi pengguna tambahan, karena hanya menampilkan layout yang telah ditentukan (`activity_hello`).
- Sangat penting untuk memastikan bahwa file layout yang disebutkan dalam `setContentView` (`activity_hello`) tersedia dan telah dikonfigurasi sesuai kebutuhan aplikasi.

## Project Count

Metode Utama:

- `onCreate`: Menginisialisasi tata letak (layout) dan komponen-komponen yang diperlukan.
- `countUp`: Menaikkan nilai hitungan dan menampilkan pada `TextView`.
- `showToast`: Menampilkan pesan Toast saat tombol diklik.

Fungsi Utama:

- Inisialisasi:
  - `onCreate` digunakan untuk menginisialisasi aktivitas dan menetapkan layout (`activity_count`) serta mendapatkan referensi ke `TextView` (`show_count`).
  - Penjumlahan dan Tampilan:
  - `countUp` digunakan untuk menambah nilai hitungan (`currentCount`) dan menampilkan pada `TextView` (`show_count`).
  - Pesan Toast:
  - `showToast` menampilkan pesan Toast dengan pesan yang diambil dari sumber daya string (`R.string.toast_message`).

Catatan:

- `currentCount` digunakan untuk menyimpan nilai hitungan saat ini.
- Fungsi `countUp` digunakan untuk meningkatkan nilai hitungan dan memperbarui tampilan pada `TextView`.
- Fungsi `showToast` digunakan untuk menampilkan pesan Toast yang berasal dari sumber daya string.

## Project News

- Metode Utama:
- `onCreate`: Menginisialisasi aktivitas dan menetapkan tata letak (layout) yang diberikan oleh `activity_icecold`.

Fungsi Utama:

- Inisialisasi:
- `onCreate` digunakan untuk menginisialisasi aktivitas dan menetapkan layout (`activity_icecold`) yang berisi tampilan berita.

Tampilan Berita:\*\*

- Aktivitas ini bertujuan untuk menampilkan tampilan berita yang diatur dalam layout `activity_icecold`.

Pembaruan dan Rekomendasi:

- Menambahkan komponen-komponen UI atau fungsionalitas tambahan sesuai kebutuhan aplikasi.
- Menggunakan komponen Android seperti `TextView`, `ImageView`, atau `WebView` untuk menampilkan konten berita yang lebih dinamis.

## Project Alarm

- Metode Utama:
  - `onCreate`: Menginisialisasi `TimePicker` dan `AlarmManager`.
  - `OnToggleClicked`: Mengelola fungsi alarm saat tombol toggle diubah.
- Fungsi Utama:
  - Setting Alarm:
    - Membuat objek `Calendar` untuk mendapatkan waktu saat ini dalam jam dan menit.
    - Menetapkan jam dan menit pada objek `Calendar` berdasarkan `TimePicker`.
    - Membuat objek `Intent` untuk memanggil `AlarmReceiver` saat alarm berbunyi.
    - Membuat objek `PendingIntent` untuk memanggil siaran tertunda saat alarm berbunyi.
    - Mengatur waktu alarm menggunakan `AlarmManager.setRepeating`.
    - Jika waktu saat ini lebih besar dari waktu alarm yang diatur, penyesuaian waktu dilakukan untuk alarm keesokan harinya.
    - Alarm berbunyi terus-menerus sampai tombol toggle dimatikan.
  - Mematikan Alarm:
    - Membatalkan alarm menggunakan `AlarmManager.cancel` saat tombol toggle dimatikan.

Pesan Log:

- Menampilkan pesan toast "ALARM ON" saat tombol toggle dihidupkan.
- Menampilkan pesan toast "ALARM OFF" saat tombol toggle dimatikan.

## Project Fibonacci

- Metode Utama:
  - `onCreate`: Menginisialisasi aktivitas dan menetapkan tata letak (layout) yang diberikan oleh `activity_toast`.
  - `updateCountDisplay`: Memperbarui tampilan pengguna dengan nilai terkini dari bilangan Fibonacci dan menyesuaikan warna teks berdasarkan aturan tertentu.
  - `showToast`: Menampilkan pesan Toast yang memberi tahu pengguna bahwa mereka berurusan dengan bilangan Fibonacci.
  - `countUp`: Menambahkan nilai bilangan Fibonacci dan memperbarui tampilan pengguna sesuai.
  - `back1`: Mengembalikan pengaturan ke awal dengan mengatur ulang nilai-nilai untuk menghitung bilangan Fibonacci.

Fungsi Utama:

- Inisialisasi:
  - `onCreate` digunakan untuk menginisialisasi aktivitas, menetapkan layout (`activity_toast`), dan mengakses elemen antarmuka pengguna seperti `TextView` dan `EditText`.
- Perhitungan Bilangan Fibonacci:
  - `countUp` digunakan untuk menghitung dan menampilkan bilangan Fibonacci selanjutnya berdasarkan input pengguna.
- Pengaturan Ulang:
  - `back1` memungkinkan pengguna mengatur ulang hitungan bilangan Fibonacci ke kondisi awal.

Antarmuka Pengguna:

- TextView: Menampilkan nilai bilangan Fibonacci dan berubah warna sesuai aturan tertentu.
- EditText: Memungkinkan pengguna memasukkan nilai maksimum untuk perhitungan bilangan Fibonacci.

Pesan Toast:

- Pesan Toast diperlihatkan saat pengguna menekan tombol untuk menyoroti penggunaan bilangan Fibonacci dalam aktivitas ini.

## Project Chat

Struktur Kode:

- Variabel Kelas:

  - `LOG_TAG`: Variabel konstan yang digunakan untuk tag log.
  - `EXTRA_MESSAGE`: Variabel konstan yang berfungsi sebagai kunci untuk menyimpan pesan ekstra dalam Intent.
  - `TEXT_REQUEST`: Konstanta yang menentukan kode permintaan untuk startActivityForResult.
  - `mMessageEditText`: EditText untuk memasukkan pesan.
  - `mReplyHeadTextView`: TextView untuk menampilkan header balasan.
  - `mReplyTextView`: TextView untuk menampilkan balasan.

- Metode onCreate:
  - Menginisialisasi tampilan dan variabel kelas.
- Metode launchSecondActivity:

  - Dipanggil ketika tombol di MainActivityOne diklik.
  - Membuat Intent untuk memulai SecondActivity dengan membawa pesan dari `mMessageEditText`.
  - Memulai aktivitas kedua dengan `startActivityForResult` untuk mendapatkan hasil balasan.

- Metode onActivityResult:
  - Dipanggil ketika aktivitas kedua selesai.
  - Memeriksa apakah permintaan adalah `TEXT_REQUEST` dan hasilnya adalah `RESULT_OK`.
  - Menampilkan header balasan dan menetapkan teks balasan ke `mReplyTextView`.

## Project Maps

- Metode onCreate:

  - Dipanggil saat aktivitas dibuat.
  - Mengatur tata letak tampilan dan menyiapkan data lokasi geografis.
  - Membuat Uri dengan data lokasi latitude dan longitude.
  - Memanggil `showMap` untuk menampilkan peta dengan lokasi yang telah ditentukan.

- Metode showMap:
  - Membuat Intent dengan tindakan `ACTION_VIEW`.
  - Mengatur data intent ke Uri yang mewakili lokasi geografis.
  - Memeriksa keberadaan aplikasi yang dapat menangani intent untuk menampilkan peta.
  - Jika ada aplikasi yang dapat menangani intent, aktivitas baru dimulai untuk menampilkan lokasi pada peta.

Catatan Tambahan:

- Intent ACTION_VIEW: Digunakan untuk meminta sistem untuk menampilkan data.
- Uri.parse: Membuat objek Uri yang mewakili lokasi geografis.

## Project Movie

Komponen Utama

- TabLayout (`tabLayout`):

  - Digunakan untuk menampilkan tab yang mewakili setiap fragmen.
  - Didefinisikan dalam layout dengan ID `tablayout`.

- ViewPager (`viewPager`):

  - Digunakan untuk menampilkan dan mengelola fragmen.
  - Didefinisikan dalam layout dengan ID `viewpager`.

- VPAdapter (`vpAdapter`):

  - Kelas yang mengg extends `FragmentPagerAdapter`.
  - Digunakan untuk menghubungkan ViewPager dengan fragmen dan menangani navigasi antar fragmen.

- Fragment1, Fragment2, dan Fragment3:
  - Fragmen yang masing-masing mewakili kategori Fantasy, Comedy, dan Romance.

# OUTPUT

### Hasil Project Uas : [CLICK HERE](https://www.youtube.com/watch?v=NOQcyGc-ygA&t=6s)
