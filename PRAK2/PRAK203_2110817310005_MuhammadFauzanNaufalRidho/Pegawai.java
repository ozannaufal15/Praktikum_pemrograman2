 
package PRAK203_2110817310005_MuhammadFauzanNaufalRidho;

/* 
 * Nama class tidak sesuai dengan nama file
 * nama file adalah Pegawai.java
 * sehingga nama class seharusnya juga Pegawai
*/
//public class Employee {
public class Pegawai {
    public String nama;
    /*
     * Pada baris ini terjadi error karena tipe data yang digunakan
     * tidak cocok dengan input yang dimasukkan
     * tipe data awal adalah char
     * seharusnya menggunakan tipe data String
     */
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    /*
     * Pada baris ini terjadi error karena method dipanggil dengan
     * argumen namun pada definisi method tidak memiliki parameter
     * dan variabel j tidak pernah dideklarasikan
     */
    //public void setJabatan() {
    //this.jabatan = j;
    //}
    public void setJabatan(String j){
        this.jabatan=j;
    }
}

