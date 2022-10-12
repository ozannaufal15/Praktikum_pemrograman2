package PRAK201_2110817310005_MuhammadFauzanNaufalRidho;

public class Soal1Main {

    public static void main(String[] args) {
        Mangga arumanis=new Mangga("Arumanis",0.3f,5000,13);
        Mangga manalagi=new Mangga("Manalagi",0.5f,7500,17);
        Mangga manggaMadu=new Mangga("Mangga Madu",0.375f,6500,12);
        arumanis.printDetail();
        manalagi.printDetail();
        manggaMadu.printDetail();
    }
}
