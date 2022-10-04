package PRAK1;
import java.util.Scanner;

public class PRAK101_2110817310005_MuhammadFauzanNaufalRidho {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name,birthPlace,month;
        int birthDay,birthMonth,birthYear,height;
        float weight;
        System.out.print("Masukkan Nama Lengkap: ");
        name=input.nextLine();
        if(name.length()<1){
            invalidInputMSG();
            input.close();
            return;
        }
        System.out.print("Masukkan Tempat Lahir: ");
        birthPlace=input.nextLine();
        if(birthPlace.length()<1){
            invalidInputMSG();
            input.close();
            return;
        }
        System.out.print("Masukkan Tanggal Lahir: ");
        birthDay=input.nextInt();
        if(birthDay>31||birthDay<1){
            invalidInputMSG();
            input.close();
            return;
        }
        input.nextLine();
        System.out.print("Masukkan Bulan Lahir: ");
        birthMonth=input.nextInt();
        if(birthMonth>12||birthMonth<1){
            invalidInputMSG();
            input.close();
            return;
        }
        input.nextLine();
        System.out.print("Masukkan Tahun Lahir: ");
        birthYear=input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Tinggi Badan: ");
        height=input.nextInt();
        if(height<=0){
            invalidInputMSG();
            input.close();
            return;
        }
        input.nextLine();
        System.out.print("Masukkan Berat Badan: ");
        weight=input.nextFloat();
        if(weight<=0){
            invalidInputMSG();
            input.close();
            return;
        }
        switch (birthMonth) {
            case 1: month="Januari";
                    break;
            case 2: month="Febuari";
                    break;
            case 3: month="Maret";
                    break;
            case 4: month="April";
                    break;
            case 5: month="May";
                    break;
            case 6: month="Juni";
                    break;
            case 7: month="Juli";
                    break;
            case 8: month="Agustus";
                    break;
            case 9: month="September";
                    break;
            case 10: month="Oktober";
                    break;
            case 11: month="November";
                    break;
            case 12: month="Desember";
                    break;
            default: month=null;
                    break;
        }
        System.out.println("Data Telah Ditambahkan,");
        System.out.print("Nama Lengkap "+name+", Lahir di "+birthPlace);
        System.out.print(" pada Tanggal "+birthDay+" "+month+" "+birthYear);
        System.out.println("\nTinggi Badan "+height+" cm dan Berat Badan "+weight+" kilogram");
        input.close();
    }
    static void invalidInputMSG(){
        System.out.println("Invalid Input");
    }
}