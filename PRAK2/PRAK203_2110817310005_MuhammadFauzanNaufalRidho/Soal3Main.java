
package PRAK203_2110817310005_MuhammadFauzanNaufalRidho;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        /*
         * Pada baris ini terjadi error karena tidak terdapat semicolon (;)
         * di akhir baris
         */
        //p1.nama = "Roi"
        p1.nama="Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        /*
         * Field umur object p1 belum diinisialisasi
         * sehingga p1.umur nilainya 0
         * dan pada println ditambahkan " Tahun" setelah p1.umur
         * agar output program sama seperti
         * yang diminta
         */
        //System.out.println("Umur: " + p1.umur);
        p1.umur=17;
        System.out.println("Umur: "+p1.umur+" Tahun");
    }
}

