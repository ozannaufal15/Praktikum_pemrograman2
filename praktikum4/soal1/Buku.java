package praktikum4.soal1;

public class Buku {
    private String judul;
    private String penulis;
    private Integer tahun;

    public Buku(String judul,String penulis,Integer tahun){
        this.judul=judul;
        this.penulis=penulis;
        this.tahun=tahun;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public void display() {
        System.out.println();
        System.out.println("Detail buku:");
        System.out.println("Judul adalah "+this.judul);
        System.out.println("Penulis adalah "+this.penulis);
        System.out.println("Tahun Terbit adalah "+this.tahun);
        System.out.println();
    }
}
