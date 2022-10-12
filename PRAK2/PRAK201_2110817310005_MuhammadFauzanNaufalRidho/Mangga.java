package PRAK201_2110817310005_MuhammadFauzanNaufalRidho;

public class Mangga {
    private String nama;
    private float berat;
    private int harga;
    private int jumlah_beli;

    public Mangga(String nama,float berat,int harga,int jumlah_beli){
        this.nama=nama;
        this.berat=berat;
        this.harga=harga;
        this.jumlah_beli=jumlah_beli;
    }

    public void printDetail(){
        System.out.println("Nama Mangga: "+this.nama);
        System.out.println("Berat: "+this.berat+" kg");
        System.out.println("Jumlah Beli: "+this.jumlah_beli);
        System.out.println("Total Berat: "+(this.berat*this.jumlah_beli)+" kg");
        System.out.println("Total Harga: "+"Rp. "+(this.jumlah_beli*this.harga));
        System.out.println();
    }
}
