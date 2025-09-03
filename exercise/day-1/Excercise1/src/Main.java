/*
### Soal Cerita – Operator di Java

1. **Cerita Kue Andi**
   Andi punya 12 kue. Dia kasih 4 kue ke adiknya. Berapa kue yang tersisa? Operator apa yang bisa dipakai untuk menghitungnya?

2. **Cerita Ongkir Toko Online**
   Sebuah toko online pasang ongkir Rp 25.000. Saat promo, ongkir dipotong setengah. Berapa ongkir yang harus dibayar? Operator apa yang bisa dipakai untuk menghitungnya?

3. **Cerita Permen Sinta**
   Sinta punya 20 permen dan mau dibagi rata ke 6 temannya. Berapa sisa permen yang tidak terbagi? Operator apa yang bisa dipakai untuk menghitung sisa pembagian?

4. **Cerita Point Game**
   Seorang pemain game punya 80 point. Setiap naik level, point bertambah 15. Setelah naik level sekali, berapa total point pemain itu? Operator apa yang bisa dipakai untuk menambahkan point dengan cepat?

5. **Cerita Tiket Bioskop**
   Budi mau nonton film. Syaratnya, hanya boleh masuk kalau umur ≥ 18. Jika umur Budi 16, apakah dia bisa masuk? Operator apa yang digunakan untuk membandingkan umur dengan syarat tersebut?
*/

public class Main {

    public static void main(String[] args) {

        // Cerita Kue Andi
        // Menggunakan operator pengurangan -
        int kueAndi=12;
        int kueDia=4;
        int sisaKueAndi=kueAndi-kueDia;
        System.out.println("Jawaban soal 1 = "+ sisaKueAndi);

        // Cerita Ongkir Toko Online
        // Menggunakan operator pembagian atau perkalian
        int ongkir=25000;
        double potongan=1/2f;
        double ongkirAkhir=ongkir*potongan;
        System.out.println("Jawaban soal 2 = "+ongkirAkhir);

        // Cerita Permen Sinta
        // Menggunakan operator modulo % untuk mendapatkan nilai sisa bagi
        int permenSinta=20;
        int temanSinta=6;
        int sisaBagi=permenSinta%temanSinta;
        System.out.println("Jawaban soal 3 = "+sisaBagi);

        // Cerita Point Game
        // Menggunakan operator penjumlahan atau mungkin memasukkan operasinya ke dalam operasi for loop jika player naik beberapa level sekaligus
        int pointPlayer=80;
        int pointLevelUp=15;
        int pointAfterLevelUp=pointPlayer+pointLevelUp;
        System.out.println("Jawaban soal 3 = "+pointAfterLevelUp);

        // Cerita Tiket Bioskop
        // Menggunakan operasi if else untuk melakukan pengecekan umur
        int umurMax=18;
        int umurBudi=16;
        boolean izin=false;
        if(umurBudi<=umurMax){
            System.out.println("Jawaban soal 5 = "+izin);
        }
        else{
            izin=true;
            System.out.println("Jawaban soal 5 = "+izin);
        }


    }
}