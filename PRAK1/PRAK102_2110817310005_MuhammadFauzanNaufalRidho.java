package PRAK1;
import java.util.Scanner;

public class PRAK102_2110817310005_MuhammadFauzanNaufalRidho {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int max=n+7;
        while(n<max){
            if(n%2==1){
                System.out.print(n);
            } else {
                System.out.print((n/2)-1);
            }
            if(n<max-1) System.out.print(", ");
            n++;
        }
        System.out.print("\n");
        input.close();
    }

}
