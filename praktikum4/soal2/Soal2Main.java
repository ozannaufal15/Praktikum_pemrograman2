package praktikum4.soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Buku buku1;
        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan pilihan: ");
        int n=input.nextInt();
        input.nextLine();
        System.out.print("Judul: ");
        String judul=input.nextLine();
        System.out.print("Penulis: ");
        String penulis=input.nextLine();
        System.out.print("Tahun Terbit: ");
        String tahun=input.next();
        input.nextLine();
        if(n==1){
            System.out.print("Genre: ");
            String genre=input.nextLine();
            System.out.print("Sinopsis: ");
            String sinopsis=input.nextLine();
            buku1=new Novel(judul, penulis, tahun, genre, sinopsis);
            buku1.display();

        }else if(n==2){
            System.out.print("Volume: ");
            Integer volume=input.nextInt();
            input.nextLine();
            System.out.print("Sinopsis: ");
            String sinopsis=input.nextLine();
            buku1=new Komik(judul, penulis, tahun, volume, sinopsis);
            buku1.display();
        }else{
            input.close();
            return;
        }
        input.close();
    }
}
