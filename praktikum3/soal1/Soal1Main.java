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
        Dadu tempDadu;
        System.out.println("=======");
        for(int i=0;i<n;i++){
            tempDadu=new Dadu();
            tempDadu.acakNilai();
            semuaDadu.add(tempDadu);
            //semuaDadu.getLast().acakNilai();
            //System.out.println(semuaDadu.getLast().getValue());
            
        }
        for(int i=0;i<n;i++){
            temp=semuaDadu.poll().getValue();
            System.out.println("Dadu ke-"+(i+1)+" bernilai "+temp);
            //System.out.println(semuaDadu.peek());
            jumlah+=temp;
        }
        System.out.println("Total nilai dadu keseluruhan "+jumlah);
        //semuaDadu.
        input.close();
    }
}
