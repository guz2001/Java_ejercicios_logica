import java.util.Scanner;

public class switch_ejerciciovideo20 {
    public static void main(String[] args){
        /*
            Programa que lee un numero  entero  y muestra si  el numero es  multiplo de 10
         */
        System.out.println("Scanner inicial");
        System.out.println("ingrese un numero para identificar si es multiplo de 10");
        Scanner multploDiez= new Scanner(System.in);
        int numeroIngresado= multploDiez.nextInt();
        int multiploDeDiez= numeroIngresado%10;
        if(multiploDeDiez==0){
            System.out.println("el numero  es multiplo de 10"+numeroIngresado);



        }else{
            System.out.println("no es multiplo de 10");
        }

    }
}
