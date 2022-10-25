package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        LinkedList<Dadu> semuaDadu=new LinkedList<Dadu>();
        int n=input.nextInt();
        int jumlah=0;
        int temp;
        for(int i=0;i<n;i++){
            semuaDadu.add(new Dadu());
        }
        for(int i=0;i<n;i++){
            temp=semuaDadu.poll().getValue();
            System.out.println("Dadu ke-"+(i+1)+" bernilai "+temp);
            jumlah+=temp;
        }
        System.out.println("Total nilai dadu keseluruhan "+jumlah);
        input.close();
    }
}
