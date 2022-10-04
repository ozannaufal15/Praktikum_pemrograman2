package PRAK1;
import java.util.Scanner;

public class PRAK103_2110817310005_MuhammadFauzanNaufalRidho {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i=0;
        n=input.nextInt();
        do{
            if(n%7!=0){
                System.out.print(n);
                if(i<4) System.out.print(", ");
            }
            n--;
            i++;
            
        }while(i<5);
        System.out.print("\n");
        input.close();
    }
}
