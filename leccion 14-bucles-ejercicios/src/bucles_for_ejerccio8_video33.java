import java.util.Scanner;

public class bucles_for_ejerccio8_video33 {
    public static void main(String[] args){
        /*
        Pedir un numero n y mostrar  todos los numeros del 1 a n
         */
        Scanner e= new Scanner (System.in);
        System.out.println("ingrese un numero n para veces: ");
        int n=e.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Numero => "+ i);
        }
    }
}
