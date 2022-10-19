package praktikum3.soal2;

import java.util.HashMap;

public class Negara {
    private HashMap<Integer, String> namaBulan=new HashMap<Integer, String>();
    
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalMerdeka;
    private int bulanMerdeka;
    private int tahunMerdeka;
    public void Negara(String nama,String jenisKepemimpinan,String namaPemimpin,int tanggalMerdeka,int bulanMerdeka,int tahunMerdeka){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
        this.tanggalMerdeka=tanggalMerdeka;
        this.bulanMerdeka=bulanMerdeka;
        this.tahunMerdeka=tahunMerdeka;
    }
    public String getNama(){
        return this.nama;
    }
    public String getJenisKepemimpinan(){
        return this.jenisKepemimpinan;
    }
    public String getNamaPemimpin(){
        return this.namaPemimpin;
    }
    public int getTanggalMerdeka(){
        return this.tanggalMerdeka;
    }
    /*
    public String getBulanMerdeka(){
        
    }
    */
    public int getTahunMerdeka(){
        return this.tahunMerdeka;
    }
}
