import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ejercicio2_arreglos_inverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numReversa=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("digite un numero para guardar: ");
            numReversa[i]=sc.nextInt();
            System.out.println("numero:" +(i+1)+" es: "+numReversa[i]);
        }
        for (int i=numReversa.length;i>0;i--){

            System.out.print(numReversa[i-1]+" ");
        }


    }
}
