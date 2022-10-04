package PRAK1;
import java.util.Scanner;

public class PRAK104_2110817310005_MuhammadFauzanNaufalRidho {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] budi=new int[3];
        int[] andi=new int[3];
        int andi_win=0,budi_win=0;
        System.out.print("Kartu Andi: ");
        for(int i=0;i<3;i++){
            andi[i]=input.nextInt();
            if(andi[i]>10||andi[i]<2){
                inputOutOfRangeMsg();
                input.close();
                return;
            }
        }
        input.nextLine();   //clear input buffer
        System.out.print("Kartu Budi: ");
        for(int i=0;i<3;i++){
            budi[i]=input.nextInt();
            if(budi[i]>10||budi[i]<2){
                inputOutOfRangeMsg();
                input.close();
                return;
            }
        }
        for(int i=0;i<3;i++){
            if(budi[i]>andi[i]) budi_win++;
            else if(andi[i]>budi[i]) andi_win++;
        }
        if(budi_win>andi_win) System.out.println("Budi");
        else if(budi_win==andi_win) System.out.println("Seri");
        else System.out.println("Andi");
        input.close();
    }
    static void inputOutOfRangeMsg(){
        System.out.println("Invalid Input");
        System.out.print("angka yang dapat dimiliki satu kartu ");
        System.out.println("adalah 2 sampai 10 saja");
    }
}
