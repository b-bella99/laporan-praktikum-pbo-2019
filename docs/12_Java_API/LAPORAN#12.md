# Laporan Praktikum #12 - Java API

## Kompetensi
1. Memahami cara penyimpanan objek menggunakan Collection dan Map.
2. Mengetahui pengelompokan dari Collection.
3. Mengetahui perbedaan dari interface Set, List dan Map.
4. Mengetahui penggunaan class-class dari interface Set, List, dan Map.
5. Memahami koneksi database menggunakan JDBC dan JDBC API

## Ringkasan Materi
Collection adalah suatu objek yang bisa digunakan untuk menyimpan sekumpulan objek.
Objek yang ada dalam Collection disebut elemen. Collection menyimpan data bertipe objek. Class-class Collection diletakkan dalam package java.util dan mempunyai dua interface utama yaitu Collection. Collection terbagi menjadi 3 kelompok yaitu:
1. Set = Set mengikuti model himpunan, dimana objek/anggota yang tersimpan dalam Set harus unik. 
2. List = List digunakan untuk menyimpan sekumpulan objek berdasarkan urutan masuk (ordered) dan menerima duplikat.
3. Map = interface yang memiliki fungsi untuk memetakan nilai dengan key unik.
4. JDBC API, terdiri dari satu set kelas dan interface yang digunakan untuk berinteraksi dengan database dari aplikasi Java. Umumnya, JDBC API melakukan 3 (tiga) fungsi berikut :
- Membangun koneksi antara aplikasi Java dan database
- Membangun dan mengeksekusi query
- Memproses hasil

## Percobaan
### Percobaan 1 - Set
Pada percobaan ini, kita membuat sebuah class bernama DemoHashSet1841720004Bella, yang dimana kita belajar mengenai Set dalam Java API. Berikut adalah hasil dari percobaan 1:

![Hasil percobaan 1](../../docs/12_Java_API/img/hasil1.png)

Link: [DemoHashSet1841720004Bella.java](../../src/12_Java_API/DemoHashSet1841720004Bella.java)

### Percobaan 2 - List
Pada percobaan 2 ini, kita  belajar mengenai fungsi Array List dalam Java API. Berikut adalah hasil percobaan 2:

![Hasil percobaan 2](../../docs/12_Java_API/img/hasil2.png)

Link: [CobaArrayList1841720004Bella.java](../../src/12_Java_API/CobaArrayList1841720004Bella.java)

### Percobaan 3 - Map
pada percobaan 3 ini, kita belajar mengenai Map dalam Java API dengan nama class DemoHashMap1841720004Bella. Berikut adalah hasilnya:

![Hasil percobaan 3](../../docs/12_Java_API/img/hasil3.png)

Link: [DemoHashMap1841720004Bella.java](../../src/12_Java_API/DemoHashMap1841720004Bella.java)

### Percobaan 4 - Implementasi ArrayList dalam GUI
Pada percobaan 4 ini, kita belajar mengenai implementasi ArrayList dalam GUI. Berikut adalah hasilnya:

![Hasil percobaan 4](../../docs/12_Java_API/img/hasil4.png)

Link: [Mahasiswa1841720004Bella.java](../../src/12_Java_API/Mahasiswa1841720004Bella.java)

Link: [TampilGui1841720004Bella.java](../../src/12_Java_API/TampilGui1841720004Bella.java)

### Percobaan 5 - Aplikasi Biodata
Pada percobaan ini, kita membuat aplikasi biodata yang dimana kita menyambungkan dengan database. Database yang digunakan MySql bernama pbo12 yag berisikan table anggota. Berikut adalah gambar table pbo12 di MySql:

![Database pbo12](../../docs/12_Java_API/img/pbo12.png)

Berikut adalah hasilnya: 

![Hasil percobaan 5](../../docs/12_Java_API/img/hasil5.png)

Link: [FormKoneksi1841720004Bella.java](../../src/12_Java_API/FormKoneksi1841720004Bella.java)

Link: [FormKoneksi1841720004Bella.form](../../src/12_Java_API/FormKoneksi1841720004Bella.form)

## Pertanyaan
1. Apakah fungsi import java.util.*; pada program diatas!

    **Jawaban:**

    Meng-import semua kelas di dalam java.

2. Pada baris program keberapakah yang berfungsi untuk menciptakan object HashSet?

    **Jawaban:**

    Pada baris ke 19.

        Set mSetCity = new HashSet();

3. Apakah fungsi potongan program dibawah ini pada percobaan 1!

    ![Pertanyaan 3](../../docs/12_Java_API/img/pertanyaan_percobaan1.png)

    **Jawaban:**
    
    Digunakan untuk menambahkan data ke dalam Array yang bernama mSetCity.

4. Tambahkan set.add(“Malang”); kemudian jalankan program! Amati hasilnya dan jelaskan
mengapa terjadi error!

    **Jawaban:**

    Karena dalam fungsi Set, objeck / anggota yang tersimpan harus unik, tidak boleh sama.

5. Jelaskan fungsi potongan program dibawah ini pada percobaan 1!

    ![Pertanyaan 5](../../docs/12_Java_API/img/pertanyaan_percobaan1_1.png)

    **Jawaban:**

    Iterator digunakan untuk perulangan dalam sebuah object HashMap.

    hasNext digunakan untuk memeriksa apakah pada objeck mIterator masih memiliki data selanjutnya, jika ada maka akan ditampilkan (dijadikan output)

    next() digunakan untuk mengambil data selanjutnya.

    toLowerCase() digunakan untuk data yang ditampilkan menjadi huruf kecil semua.


6. Apakah fungsi potongan program dibawah ini!

    ![Pertanyaan 6](../../docs/12_Java_API/img/pertanyaan_percobaan2.png)

    **Jawaban:**

    Digunakan untuk menampilkan isi dari mListCountry.

7. Ganti potongan program pada soal no 1 menjadi sebagai berikut: 

    ![Pertanyaan 6](../../docs/12_Java_API/img/pertanyaan_percobaan2_1.png)


    Kemudian jalankan program tersebut!

    **Jawaban:**

    Berikut adalah hasilnya:

    ![Hasil 6](../../docs/12_Java_API/img/hasil_percobaan2_1.png)

    Data akan ditampilkan namun secara sejajar dengan menggunakan fungsi Iterator.

8. Jelaskan perbedaan menampilkan data pada ArrayList menggunakan potongan program pada soal no 6 dan no 7!

    **Jawaban:**

    Pada nno 6, data ditampilkan dengan cara mengambil apa yang ingin ditampilkan dengan menggunakan fungsi get().

    Sedangkan pada no 7, menampilkan seluruh isi dari mListCountry dengan fungsi Iterator.

9. Jelaskan fungsi hMapItem.put("1","Biskuit") pada program!

    **Jawaban:** 

    Menambahkan data kedalam hMapItem dengan fungsi put().

10. Jelaskan fungsi hMapItem.size() pada program!

    **Jawaban:**

    Digunakan untuk mengambil ukuran HashMap (jumlah item pada HashMap).

11. Jelaskan fungsi hMapItem.remove("1") pada program!

    **Jawaban:**

    Digunakan untuk menghapus isi / nilai dari hashMap yaitu nilai 1.

12. Jelaskan fungsi hMapItem.clear() pada program!

    **Jawaban:**

    Digunakan untuk menghapus seluruh isi hashMap.

13. Tambahkan kode program yang di blok pada program yang sudah anda buat!

    ![Pertanyaan 13](../../docs/12_Java_API/img/pertanyaan_percobaan3.png)

    **Jawaban:**

    Berikut adalah gambar script yang sudah saya tambahkan sesuai perintah:

    ![Hasil pertanyaan 13](../../docs/12_Java_API/img/hasil_percobaan3.png)

14. Jalankan program dan amati apa yang terjadi!

    **Jawaban:**

    Maka data (isi dari mIterator) ditampilkan semuanya.

15. Apakah perbedaan program sebelumnya dan setelah ditambahkan kode program pada soal no 13 diatas? Jelaskan!

    **Jawaban:**

    Data yang ditampilkan akan langsung semuanya, sedangkan sebelum ditambahkan data yang ditampilkan beserta nomernya dan dalam tanda kurung kurawal.

16. Setelah menambah code pada action button klik, coba jalankan program dan tambahkan data. Apakah program berhasil menambahkan data? Jika tidak apakah penyebabnya.

    **Jawaban:**

    Tidak bisa menambahkan data, karena gagal memuat koneksi ke MySqlnya.

17. Jelaskan maksud source code untuk melakukan insert data diatas (percobaan 5)?

    **Jawaban:**

    Menambahkan data ke table anggota yang dimana didapat dari textfield dengan variable jTFNama, jTFAlamat, jTFTelepon.

18. Jelaskan alur dari method ambil_data_tabelBella?

    **Jawaban:**

    Mendapatkan variasi tipe data di JTable, kemudian menghapus seluruh elemen. Setelah itu memberitahu semua listener bahwa semua nilai sel dalam baris tabel mungkin telah berubah. Kemudian akan mengeksekusi try-catch, yang dimana dalam try akan membuka koneksi ke MySQL dan akan menampilkan isi dari tabel anggota. Dan di dalam catch akan menampilkan pesan error ketika disaat menampilkan data terjadi kesalahan. 

19. Buat fungsi untuk merefresh sehingga data yang baru dapat ditampilkan pada tabel 2.

    **Jawaban:**

    Script yang ditambahkan sebagai berikut:

        private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                               
            // TODO add your handling code here:
            ambil_data_tabelBella();
        }

## Kesimpulan
Pada jobsheet kali ini, kita mempelajari tentang penyimpanan objek menggunakan collection dan map, pengelompokan dari collection, perbedaan interface Set, List dan Map, penggunaan class-class dari interface Set, List dan Map, dan juga koneksi database menggunakan JDBC API (mysql).

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

_**(Bella Setyowati)**_