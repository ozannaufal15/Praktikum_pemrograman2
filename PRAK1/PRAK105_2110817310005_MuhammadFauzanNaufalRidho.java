package PRAK1;
import java.util.Scanner;

public class PRAK105_2110817310005_MuhammadFauzanNaufalRidho {
    public static void main(String[] args) {
        final float PI=3.14f;
        Scanner input=new Scanner(System.in);
        float radius,height,volume;
        System.out.print("Masukkan Jari-jari: ");
        radius=input.nextFloat();
        if(radius<=0){
            invalidInputMSG();
            input.close();
            return;
        }
        input.nextLine();
        System.out.print("Masukkan Tinggi: ");
        height=input.nextFloat();
        if(height<=0){
            invalidInputMSG();
            input.close();
            return;
        }
        volume =PI*radius*radius*height;
        System.out.println("Volume tabung dengan jari-jari "+radius+" cm dan");
        System.out.println("tinggi "+height+" cm adalah "+volume+" cm3");
        input.close();
    }
    static void invalidInputMSG(){
        System.out.println("Invalid Input");
    }
}
