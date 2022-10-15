package PRAK202_2110817310005_MuhammadFauzanNaufalRidho;

public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    private String pemilik;

    public Mobil(){
        return;
    }
    public void setPemilik(String pemilik){
        this.pemilik=pemilik;
    }
    public String getPemilik(){
        return this.pemilik;
    }
    public String getPajak(){
        return String.format("%,d", (this.harga/100)*2);
    }
    public void info(){
        System.out.println("Merek Mobil: "+this.merek);
        System.out.println("Harga: RP. "+String.format("%,d", this.harga));
        System.out.println("Kapasitas: "+this.kapasitas+"cc");
    }
}
