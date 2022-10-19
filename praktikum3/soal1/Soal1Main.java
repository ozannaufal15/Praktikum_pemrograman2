package praktikum3.soal1;
import java.util.LinkedList;
import java.util.Scanner;


public class Soal1Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        LinkedList<Dadu> semuaDadu=new LinkedList<Dadu>();
        int n=input.nextInt();
        int jumlah=0;
        System.out.println("=======");
        for(int i=0;i<n;i++){
            semuaDadu.add(new Dadu());
            semuaDadu.getLast().acakNilai();
            //System.out.println(semuaDadu.getLast().getValue());
            
        }
        for(int i=0;i<semuaDadu.size();i++){
            System.out.println("Dadu ke-"+(i+1)+" bernilai "+semuaDadu.get(i).getValue());
            jumlah+=semuaDadu.get(i).getValue();
        }
        System.out.println("Total nilai dadu keseluruhan "+jumlah);

        input.close();
    }
}
