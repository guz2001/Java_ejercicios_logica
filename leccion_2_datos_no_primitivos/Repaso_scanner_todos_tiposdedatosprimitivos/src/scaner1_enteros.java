import java.util.Scanner;

public class scaner1_enteros {
    public static void main(String[]args){
        System.out.println("Primer programa scanner enteros todo tipos");
        //primero ejemplo de tipo de dato byte que son 8 bites osea 1 byte
        /*
           el byte tiene un limite minimo de -128 y de maximo 128 debido a que reserva 1 bite para el negativo y el cero
           lo toma como valor positivo por lo que queda -128||0||127 el cero se roba el lugar del 128
        */
        byte numero_minimo=-128;
        System.out.println("minimo numero o da error es:"+ numero_minimo);
        byte numero_maximo=127;
        System.out.println("maximo si no da erro es de: "+ numero_maximo);
        Scanner scanner_byte= new Scanner(System.in);
        System.out.println("ingrese un numero del 0 a 127: ");
        byte numero_maximo_8bytes= scanner_byte.nextByte();
        System.out.println("numero ingresado es de:"+ numero_maximo_8bytes);





    }

}
