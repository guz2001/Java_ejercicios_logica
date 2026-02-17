import java.util.Scanner;

public class scanner_enteros_short {
    public static void main(String[] args){
        System.out.println("Repaso de  tipo de dato short");
        System.out.println("==========================================================");
        //este short tiene dos bytes o 16 bites para almacenar datos o 32768 espacios
        short short_rango_minimo=-32768;
        short short_rango_maximo=32767;

        System.out.println( "maximo short  "+short_rango_minimo+" "+" maximo de short "+ short_rango_maximo);
        Scanner short_scanner= new Scanner(System.in);
        System.out.println("ingrese un numero para short segun el limite establecido");
        short numero_short= short_scanner.nextShort();
        System.out.println("numero escogido es de: "+ numero_short);


    }
}
