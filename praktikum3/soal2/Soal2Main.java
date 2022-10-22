package praktikum3.soal2;

import java.util.LinkedList;
import java.util.Scanner;


public class Soal2Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Negara> semuaNegara=new LinkedList<Negara>();
        int n;
        System.out.println("1");
        n=input.nextInt();
        input.nextLine();
        for(int i=0;i<n;i++){
            semuaNegara.add(inputNegara());    
        }
        while(!semuaNegara.isEmpty()){
            semuaNegara.poll().printDetail();
        }
        input.close();
    }
    
    public static Negara inputNegara(){
        String nama;
        String jenisKepemimpinan;
        String namaPemimpin;
        int tanggalMerdeka;
        int bulanMerdeka;
        int tahunMerdeka;
        nama=input.nextLine();
        jenisKepemimpinan=input.nextLine();
        namaPemimpin=input.nextLine();
        if(Negara.isMonarki(jenisKepemimpinan)){
            return new Negara(nama,jenisKepemimpinan,namaPemimpin);
        }
        tanggalMerdeka=input.nextInt();
        input.nextLine();
        bulanMerdeka=input.nextInt();
        input.nextLine();
        tahunMerdeka=input.nextInt();
        input.nextLine();
        return new Negara(nama,jenisKepemimpinan,namaPemimpin,tanggalMerdeka,bulanMerdeka,tahunMerdeka);
    }
}
